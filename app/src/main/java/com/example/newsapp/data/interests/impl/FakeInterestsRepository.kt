package com.example.newsapp.data.interests.impl

import com.example.newsapp.data.Result
import com.example.newsapp.data.interests.InterestSection
import com.example.newsapp.data.interests.InterestsRepository
import com.example.newsapp.data.interests.TopicSelection
import com.example.newsapp.utils.addOrRemove
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * Implementation of InterestRepository that returns a hardcoded list of
 * topics, people and publications synchronously.
 */
@OptIn(ExperimentalCoroutinesApi::class)
class FakeInterestsRepository : InterestsRepository {

    private val topics by lazy {
        listOf(
            InterestSection("India", listOf("Corona Virus", "Indian Subcontinent", "Defence")),
            InterestSection(
                "International News",
                listOf("Ukraine War", "IMF", "OPEC+", "QUAD", "2023 Recession", "BREXIT", "Credit Sussie")
            ),
            InterestSection("National News", listOf("Indian Economy", "National Politics", "New Education Policy", "Article 370")),
            InterestSection(
                "Science",
                listOf("Space", "Internet of Things", "Algorithms", "Robotics", "Nano Technology", "ISRO", "DRDO")
            ),
            InterestSection(
                "Sports",
                listOf("Cricket", "Football", "Chess", "Badminton", "Formula One")
            )
        )
    }

    private val people by lazy {
        listOf(
            "Narendra Modi",
            "Sundar Pichai",
            "Dr.S Jaishankar",
            "Sai Pallavi",
            "Mithila Palkar",
            "Shahrukh Khan",
            "Dipak Adhikari (Dev)",
            "Donald Trump",
            "S. Somnath",
            "Momota Banerjee",
            "Gen. Anil Chauhan"
        )
    }

    private val publications by lazy {
        listOf(
            "The Hindu",
            "Washington Post",
            "News 18",
            "CrickTracker",
            "Bleacher Football",
            "New Scientist",
            "The Royal Society of London",
            "Yojna Magazine",
            "Al Jazeera English"
        )
    }

    // for now, keep the selections in memory
    private val selectedTopics = MutableStateFlow(setOf<TopicSelection>())
    private val selectedPeople = MutableStateFlow(setOf<String>())
    private val selectedPublications = MutableStateFlow(setOf<String>())

    // Used to make suspend functions that read and update state safe to call from any thread
    private val mutex = Mutex()

    override suspend fun getTopics(): Result<List<InterestSection>> {
        return Result.Success(topics)
    }

    override suspend fun getPeople(): Result<List<String>> {
        return Result.Success(people)
    }

    override suspend fun getPublications(): Result<List<String>> {
        return Result.Success(publications)
    }

    override suspend fun toggleTopicSelection(topic: TopicSelection) {
        mutex.withLock {
            val set = selectedTopics.value.toMutableSet()
            set.addOrRemove(topic)
            selectedTopics.value = set
        }
    }

    override suspend fun togglePersonSelected(person: String) {
        mutex.withLock {
            val set = selectedPeople.value.toMutableSet()
            set.addOrRemove(person)
            selectedPeople.value = set
        }
    }

    override suspend fun togglePublicationSelected(publication: String) {
        mutex.withLock {
            val set = selectedPublications.value.toMutableSet()
            set.addOrRemove(publication)
            selectedPublications.value = set
        }
    }

    override fun observeTopicsSelected(): Flow<Set<TopicSelection>> = selectedTopics

    override fun observePeopleSelected(): Flow<Set<String>> = selectedPeople

    override fun observePublicationSelected(): Flow<Set<String>> = selectedPublications
}
