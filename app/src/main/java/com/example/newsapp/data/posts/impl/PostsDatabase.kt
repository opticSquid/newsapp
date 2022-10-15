@file:Suppress("ktlint:max-line-length") // String constants read better
package com.example.newsapp.data.posts.impl
// This is the mock post database
// You need to put in cloud
import com.example.newsapp.R
import com.example.newsapp.model.*

/**
 * Define hardcoded posts to avoid handling any non-ui operations.
 */

val Sailesh = PostAuthor("Sailesh", "https://www.ndtv.com")
val AP = PostAuthor("AP", "https://www.livemint.com")
val kinshuk = PostAuthor("Kinshuk Basu", "https://www.telegraphindia.com/my-kolkata")
val htSportsDeck = PostAuthor(
    "Hindustan Times Sports Deck",
    "https://www.hindustantimes.com/author/ht-sports-desk-101607439300849"
)

val ndtv_pub = Publication(
    "NDTV",
    "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/NDTV_logo.svg/1280px-NDTV_logo.svg.png"
)
val mint_pub = Publication("Live Mint", "https://scontent.fccu16-1.fna.fbcdn.net/v/t1.6435-9/118995474_3505153079534742_6592607167659120097_n.png?_nc_cat=1&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=6cwHe-MdI0kAX_r7oJg&_nc_ht=scontent.fccu16-1.fna&oh=00_AT8zFld5FoN9kYHoUrjWXAi4KIQnVVOvlEBqHwQerQ5oNg&oe=636FA6F4")
val theHindu_pub =
    Publication("The Hindu", "https://www.thehindu.com/theme/images/th-online/logo-sq.png")
val hindusthanTimes_pub = Publication(
    "Hindustan Times",
    "https://www.freelogovectors.net/wp-content/uploads/2021/12/hindustan-times-logo-freelogovectors.net_-400x396.png"
)
val myKolkata_pub = Publication(
    "My Kolkata",
    "https://scontent.fccu16-1.fna.fbcdn.net/v/t39.30808-6/276283958_130940576168405_3750936153808501047_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=Ya7KhdGcyg8AX-SpV_U&tn=YVBAiEkZ6wMW_dIP&_nc_ht=scontent.fccu16-1.fna&oh=00_AT8YgMtB0U-YsB2Mr1GtHjbk9zt1_Bl1QlqOvGcZamDIXA&oe=6350626B"
)
val paragraphsPost1 = listOf(
    Paragraph(
        ParagraphType.Text,
        "New Delhi: A threatening email warning of a bomb in a Delhi-bound flight from Moscow was received at Indira Gandhi International Airport (IGI) on Thursday night, the officials said."
    ),
    Paragraph(
        ParagraphType.Text,
        "Following the threat mail, security agencies were put on alert and airport security was increased"
    ),
    Paragraph(
        ParagraphType.Text,
        "The flight was checked and nothing has been found so far, the official said, adding that the aircraft has been isolated. According to police, the flight arrived at the Delhi airport at 3:20 am from Moscow."
    ),

    Paragraph(
        ParagraphType.Text,
        "'There was a call at 11:15 pm about a bomb in the flight coming from Moscow to Terminal 3 (T3) at 3:20 tonight. Flight number SU232 landed on runway 29', an official said. A total 386 passengers and 16 crew members were deboarded from the flight."
    ),
    Paragraph(
        ParagraphType.Text,
        "The matter is being investigated. This is not the first time such an incident has occurred. On September 10, a bomb threat call for a London-bound Air India flight was received at the airport after that security agencies were alerted."
    ),
    Paragraph(
        ParagraphType.Text,
        "\"We received a bomb threat call about a flight going to London. On Thursday night at 10.30 pm, a phone call came on the landline of Ranhola police station in Outer Delhi. The caller said that on the lines of 9/11 attacks in the US, an Air India flight to London would be blown up,\" Delhi Police sources had said.",
    ),
)

val paragraphsPost2 = listOf(
    Paragraph(
        ParagraphType.Quote,
        "India could produce 405 gigawatts of energy from renewable sources by 2030 surpassing even the government's target of producing 50% of its electricity from non-fossil fuel sources by the end of the decade",
    ), Paragraph(
        ParagraphType.Text,
        "India’s renewables sector is booming, with the country projected to add 35 to 40 gigawatts of renewable energy annually until 2030, enough to power up to 30 million more homes each year, a report said Thursday.",
    ), Paragraph(
        ParagraphType.Text,
        "The Institute for Energy Economics and Financial Analysis estimated that India, the third largest energy-consuming country in the world, will reach 405 gigawatts of renewable energy capacity by 2030. It's expected to surpass the government’s target of producing 50% of its electricity from non-fossil fuel sources by the end of the decade."
    ), Paragraph(
        ParagraphType.Text,
        "The Indian government's own projections estimate the country will produce even more renewable energy — 500 gigawatts — in the same time frame. Currently, fossil fuels account for 59% of India’s installed energy capacity, but are expected to make up just 31.6% of the energy mix by 2030.",
    ), Paragraph(
        ParagraphType.Header,
        "'While there were disruptions to India’s clean energy journey because of the war in Europe among other reasons, India has big plans,' said Vibhuti Garg, co-author of the report and senior energy specialist at IEEFA. 'India is energy hungry and this hunger will only increase with our economic and population growth.'"
    ), Paragraph(
        ParagraphType.Text,
        "She added that the low cost of renewables as well as the need for cleaner energy sources to curb climate change have driven the growth of the sector in the country, which is the world's third largest renewable energy market.  No other country's energy needs are expected to balloon as much as India's in the coming years, as living standards improve and its 1.3 billion population grows.  The report, which analyzed data from various green energy corporations and publicly funded energy companies, also found that 151 gigawatts of renewable energy will be added by private clean energy companies alone. Adani Green Energy, a private company, will account for the largest single addition, going from 5.8 gigawatts to 45 gigawatts of renewable energy production.",

        ), Paragraph(
        ParagraphType.Text,
        "Although the country has made significant strides in clean energy, experts say there is still room for improvement.",
    ), Paragraph(
        ParagraphType.Text,
        "India’s “ambitious renewable energy policies\" haven’t yet halted the country’s coal pipeline, said Nandini Das, a climate and energy economist at the Berlin-based think tank, Climate Analytics.\n" + "\n" + "She added that there should be a “scheduled retirement plan of the existing coal capacities to give a clear signal that we are moving towards clean energy\" and the current subsidies for fossil fuels in India should be reformed.\n" + "\n" + "But shutting down coal and moving towards greener energy needs financing. Recent estimates say India will require around \$223 billion of investment to meet its 2030 energy goals.\n" + "\n" + "Long-time observers of India’s clean energy transition point out rooftop solar energy is also lacking: the country has just 7.5 gigawatts of rooftop solar installed of a planned 40 gigawatts by the end of the year."
    ), Paragraph(
        ParagraphType.Text,
        "“The challenge is that different states have different rooftop solar policies. We don’t have a holistic national policy for this segment,\" said Aditya Lolla of the London-based environmental think tank, Ember.\n" + "\n" + "Lolla added that other renewable energy projects also need to be ramped up.\n" + "\n" + "“We really need to increase the build rates. This year we are installing an average of 1.7 gigawatts every month and we need to be hitting 3.7 gigawatts,\" he said. “We can do many things to ramp up but that is the foremost thing that needs to happen and this needs to happen very soon.\"",

        )
)

val paragraphsPost3 = listOf(
    Paragraph(
        ParagraphType.Quote,
        "The vote in the 193-member U.N. General Assembly was 143-5 with 35 abstentions, the strongest support from the world body for Ukraine against Russia’s invasion and the annexation of the four regions",
    ), Paragraph(
        ParagraphType.Text,
        "The U. N. General Assembly voted overwhelmingly Wednesday to condemn Russia’s “attempted illegal annexation” of four Ukrainian regions and demand its immediate reversal, a sign of strong global opposition to the seven-month war and Moscow’s attempt to grab its neighbour’s territory. The vote in the 193-member world body was 143-5 with 35 abstentions. It was the strongest support from the General Assembly for Ukraine and against Russia of the four resolutions it has approved since Russian troops invaded Ukraine on February 24.",
    ), Paragraph(
        ParagraphType.Text,
        "Ukraine's U. N. ambassador, Sergiy Kyslytsya, called the vote “amazing\" and “a historic moment.\" U. S. Ambassador Linda Thomas-Greenfield said supporters were “holding our breaths\" and called it “a monumental day.\" European Union Ambassador Olof Skoog called it “a great success\" that sends “a resounding message to Russia that they are and remain isolated.\" U. S. President Joe Biden said in a statement that the vote demonstrated the world “is more united and more determined than ever to hold Russia accountable for its violations.” It is “a clear message” that “Russia cannot erase a sovereign state from the map” and it “cannot change borders by force,” he said.",
    ), Paragraph(
        ParagraphType.Text,
        "The Western-sponsored resolution was a response to Russia’s announced annexation last month of Ukraine’s Donetsk, Luhansk, Kherson and Zaporizhzhia regions. Moscow acted following Kremlin-orchestrated “referendums” that the Ukrainian government and the West have dismissed as sham votes conducted on occupied land amid warfare and displacement.",
    )
)

val paragraphsPost4 = listOf(
    Paragraph(
        ParagraphType.Text,
        "Former India captain Sourav Ganguly didn't lose his humour even as multiple reports have suggested since earlier this week that he is less likely to have a second term as the president of BCCI. It was been widely reported that former India player and 1983 World Cup winner Roger Binny is set to replace Ganguly in the role; the 50-year-old Ganguly became the BCCI President in 2019, following a four-year stint in a similar role at the Cricket Association of Bengal."
    ), Paragraph(
        ParagraphType.Text,
        "As they did the commentary, Stuart Binny was bowling to Joe Root during an India-England Test. When the clip ended, Ganguly cut the anchor to make a rather tongue-in-cheek remark.",
    ), Paragraph(
        ParagraphType.Quote,
        "\"By the way, that Binny is not Roger Binny. That's Stuart Binny,\" Ganguly said during an event organised by Bandhan Bank. The comment drew instant laughter from the people sitting in the audience.",
    ), Paragraph(
        ParagraphType.Text,
        "The anchor, too, joined on the banter. “Very important point to make, especially on this day,” he said.",
    ), Paragraph(
        ParagraphType.Text,
        "Earlier, Ganguly also said on the same event that he \"can't be an administrator forever\" and \"rejections\" are part of life.\n" + "\n" + "\"You can't play forever. You can't be an administrator forever, but it's been fun doing both and seeing both sides of the coin. I will go for bigger things in future,\" Ganguly said on the sidelines of an event.\n" + "\n" + "\"I was a cricketer's administrator. Yes you had to make decisions because there's so much cricket happening, there's so much money around. There's women's cricket, there's domestic cricket. Yes you had to take calls at times as an individual,\" he added.",
    )
)

val paragraphsPost5 = listOf(
    Paragraph(
        ParagraphType.Text,
        "The tunneling work for the East-West Metro project, which aims to connect Howrah Maidan to Sector V via Sealdah, will resume in Bowbazar within a fortnight, after a gap of over four months, officials of the Kolkata Metro Rail Corporation (KMRC), the implementing agency for the 16.6 km project, said on Thursday.",
    ), Paragraph(
        ParagraphType.Header, "Collections vs sequences"
    ), Paragraph(
        ParagraphType.Text,
        "In May KMRC had suspended the work of constructing an underground tunnel in Bowbazar in the wake of a fresh round of subsidence on Durga Pituri Lane following leakage of underground water.\n" + "\n" + "The subsidence had resulted in cracks appearing in at least nine buildings on Durga Pituri Lane in Bowbazar, leaving 160 people displaced for the second time in less than three years.",
    ), Paragraph(
        ParagraphType.Quote,
        "'We will start the work of grouting the underground soil in Bowbazar within a fortnight,' N.C. Karmali, director (project) of KMRC told The Telegraph on Thursday.",
    ), Paragraph(
        ParagraphType.Quote,
        "'After observing the effectiveness of the grouting process we will start planning the removal of concrete that was laid to plug the water leakage in Bowbazar.'",
    ), Paragraph(
        ParagraphType.Text,
        "Senior KMRC engineers said the act of grouting the underground soil would be carried out under supervision of experts in a step-by-step process, which would include drilling a hole through the concrete mass that has been laid, and the mixture, pumped into the soil under high pressure.\n" + "\n" + "“The whole idea of this grouting is to make the lower base of the tunnel impervious to water so that there is no water inside the shaft,” said a senior KMRC official."
    ), Paragraph(
        ParagraphType.Quote,
        "“It will take around one and a half months. It is a complex process since one doesn’t get to see what’s happening underground.”\n" + "\n" + "There are two tunnels of the East-West metro and officials said the grouting work in Bowbazar would be aimed at strengthening the underground soil of the west-bound tunnel. Trains at Sealdah are now running on the eastbound tunnel.\n" + "\n"
    ), Paragraph(
        ParagraphType.Text,
        "Engineers said the work of grouting underground would be followed by the more challenging task of removing the concrete that was poured to stop water leakage underneath Durga Pituri Lane.\n" + "\n" + "“We will have to remove around three metres thick layer of concrete from underground after the grouting work is successfully done,” the official said.\n" + "\n" + "“The entire area of leakage was completely sealed with concrete to outlast this monsoon season and avoid further subsidence in the area.”",
    )
)

val post1 = Post(
    id = "dc523f0ed25c",
    title = "Bomb Threat On Moscow Flight To Delhi With 400 On Board, Airport On Alert",
    subtitle = "Following the threat mail, security agencies were put on alert and airport security was increased. A total of 386 passengers and 16 crew members were deboarded from the flight.",
    url = "https://www.ndtv.com/india-news/bomb-threat-on-delhi-moscow-flight-igi-airport-on-alert-3430113",
    publication = ndtv_pub,
    metadata = Metadata(
        author = Sailesh, date = "Oct 14", readTimeMinutes = 5
    ),
    paragraphs = paragraphsPost1,
    imageId = R.drawable.post1_full,
    imageThumbId = R.drawable.post1_thumbnail
)

val post2 = Post(
    id = "7446d8dfd7dc",
    title = "India is investing heavily in renewable energy and has committed to producing 50% of its power from clean energy sources by 2030.",
    subtitle = "India is investing heavily in renewable energy and has committed to producing 50% of its power from clean energy sources by 2030.",
    url = "https://www.livemint.com/industry/energy/indias-energy-future-is-looking-green-says-report-11665619213673.html",
    publication = mint_pub,
    metadata = Metadata(
        author = AP, date = "Oct 13", readTimeMinutes = 3
    ),
    paragraphs = paragraphsPost2,
    imageId = R.drawable.post2_full,
    imageThumbId = R.drawable.post2_thumbnail
)

val post3 = Post(
    id = "ac552dcc1741",
    title = "U.N. demands Russia reverse Ukraine annexations, India abstains from vote",
    url = "https://www.thehindu.com/news/international/un-demands-russia-reverse-illegal-annexations-in-ukraine/article66003910.ece",
    publication = theHindu_pub,
    metadata = Metadata(
        author = AP, date = "OCT 13", readTimeMinutes = 1
    ),
    paragraphs = paragraphsPost3,
    imageId = R.drawable.post3_full,
    imageThumbId = R.drawable.post3_thumbnail
)

val post4 = Post(
    id = "84eb677660d9",
    title = "'By the way, that's not Roger Binny...': Sourav Ganguly's tongue-in-cheek remark leaves audience in splits",
    subtitle = "Roger Binny is likely to succeed Sourav Ganguly as the new president of BCCI.",
    url = "https://www.hindustantimes.com/cricket/watch-by-the-way-that-s-not-roger-binny-sourav-ganguly-s-cheeky-remark-leaves-audience-in-splits-101665713001594.html",
    publication = hindusthanTimes_pub,
    metadata = Metadata(
        author = htSportsDeck, date = "OCT 14", readTimeMinutes = 2
    ),
    paragraphs = paragraphsPost4,
    imageId = R.drawable.post4_full,
    imageThumbId = R.drawable.post4_thumbnail
)

val post5 = Post(
    id = "55db18283aca",
    title = "Metro tunnel work to resume in Bowbazar",
    subtitle = "In May, KMRC had suspended the work of constructing an underground tunnel in Bowbazar in the wake of a fresh round of subsidence on Durga Pituri Lane following leakage of underground water",
    url = "https://www.telegraphindia.com/my-kolkata/news/metro-tunnel-work-to-resume-in-bowbazar/cid/1891949",
    publication = myKolkata_pub,
    metadata = Metadata(
        author = kinshuk, date = "OCT 14", readTimeMinutes = 2
    ),
    paragraphs = paragraphsPost5,
    imageId = R.drawable.post5_full,
    imageThumbId = R.drawable.post5_thumbnail
)

val posts: PostsFeed = PostsFeed(
    highlightedPost = post4, recommendedPosts = listOf(post1, post2, post3), popularPosts = listOf(
        post5, post1.copy(id = "post6"), post2.copy(id = "post7")
    ), recentPosts = listOf(
        post3.copy(id = "post8"), post4.copy(id = "post9"), post5.copy(id = "post10")
    )
)
