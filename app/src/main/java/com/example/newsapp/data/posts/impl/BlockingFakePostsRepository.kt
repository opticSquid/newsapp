package com.example.newsapp.data.posts.impl

import com.example.newsapp.data.Result
import com.example.newsapp.data.posts.PostsRepository
import com.example.newsapp.model.Post
import com.example.newsapp.model.PostsFeed
import com.example.newsapp.utils.addOrRemove
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.withContext

/**
 * Implementation of PostsRepository that returns a hardcoded list of
 * posts with resources synchronously.
 */
@OptIn(ExperimentalCoroutinesApi::class)
class BlockingFakePostsRepository : PostsRepository {

    // for now, keep the favorites in memory
    private val favorites = MutableStateFlow<Set<String>>(setOf())

    override suspend fun getPost(postId: String?): Result<Post> {
        return withContext(Dispatchers.IO) {
            val post = posts.allPosts.find { it.id == postId }
            if (post == null) {
                Result.Error(IllegalArgumentException("Unable to find post"))
            } else {
                Result.Success(post)
            }
        }
    }

    override suspend fun getPostsFeed(): Result<PostsFeed> {
        return Result.Success(posts)
    }

    override fun observeFavorites(): Flow<Set<String>> = favorites

    override suspend fun toggleFavorite(postId: String) {
        val set = favorites.value.toMutableSet()
        set.addOrRemove(postId)
        favorites.value = set
    }
}
