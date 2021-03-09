package com.dicoding.movilogue.utils

import com.dicoding.movilogue.data.Movie
import com.dicoding.movilogue.data.TVShow
import java.util.*

object DataDummy {

    fun generateDummyMovies(): List<Movie> {

        val items = ArrayList<Movie>()

        items.add(
            Movie(
                581389,
                "Space Sweepers",
                "When the crew of a space junk collector ship called The Victory discovers a humanoid robot named Dorothy that's known to be a weapon of mass destruction, they get involved in a risky business deal which puts their lives at stake.",
                7.3,
                "/y2Yp7KC2FJSsdlRM5qkkIwQGCqU.jpg",
                "2021-02-05"
            )
        )
        items.add(
            Movie(
                464052,
                "Wonder Woman 1984",
                "Wonder Woman comes into conflict with the Soviet Union during the Cold War in the 1980s and finds a formidable foe by the name of the Cheetah.",
                6.9,
                "/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg",
                "2020-12-16"
            )
        )
        items.add(
            Movie(
                587996,
                "Below Zero",
                "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
                6.4,
                "/dWSnsAGTfc8U27bWsy2RfwZs0Bs.jpg",
                "2021-01-29"
            )
        )
        items.add(
            Movie(
                602269,
                "The Little Things",
                "Deputy Sheriff Joe \\\"Deke\\\" Deacon joins forces with Sgt. Jim Baxter to search for a serial killer who's terrorizing Los Angeles. As they track the culprit, Baxter is unaware that the investigation is dredging up echoes of Deke's past, uncovering disturbing secrets that could threaten more than his case.",
                6.4,
                "/c7VlGCCgM9GZivKSzBgzuOVxQn7.jpg",
                "2021-01-28"
            )
        )
        items.add(
            Movie(
                775996,
                "Outside the Wire",
                "In the near future, a drone pilot is sent into a deadly militarized zone and must work with an android officer to locate a doomsday device.",
                6.5,
                "/6XYLiMxHAaCsoyrVo38LBWMw2p8.jpg",
                "2021-01-15"
            )
        )

        return items
    }

    fun generateDummyTVShows(): List<TVShow> {

        val items = ArrayList<TVShow>()

        items.add(
            TVShow(
                85271,
                "WandaVision",
                "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                8.4,
                "/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
                "2021-01-15"
            )
        )
        items.add(
            TVShow(
                69050,
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                8.6,
                "/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                "2017-01-26"
            )
        )
        items.add(
            TVShow(
                71712,
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives.",
                8.6,
                "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                "2017-09-25"
            )
        )
        items.add(
            TVShow(
                79460,
                "Legacies",
                "Deputy Sheriff Joe \\\"Deke\\\" Deacon joins forces with Sgt. Jim Baxter to search for a serial killer who's terrorizing Los Angeles. As they track the culprit, Baxter is unaware that the investigation is dredging up echoes of Deke's past, uncovering disturbing secrets that could threaten more than his case.",
                6.4,
                "/c7VlGCCgM9GZivKSzBgzuOVxQn7.jpg",
                "2018-10-25"
            )
        )
        items.add(
            TVShow(
                775996,
                "Outside the Wire",
                "In the near future, a drone pilot is sent into a deadly militarized zone and must work with an android officer to locate a doomsday device.",
                6.5,
                "/6XYLiMxHAaCsoyrVo38LBWMw2p8.jpg",
                "2021-01-15"
            )
        )

        return items
    }
}
