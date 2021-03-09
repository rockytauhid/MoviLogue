package com.dicoding.movilogue.utils

import com.dicoding.movilogue.data.Movie
import com.dicoding.movilogue.data.TVShow
import org.json.JSONArray

object MappingHelper {
    fun mapMovieJsonArrayToArrayList(jsonArray: JSONArray): ArrayList<Movie> {
        val listItems = ArrayList<Movie>()
        for (i in 0 until jsonArray.length()) {
            val item = Movie()
            val jsonObject = jsonArray.getJSONObject(i)
            item.id = jsonObject.getInt("id")
            item.title = jsonObject.getString("title")
            item.overview = jsonObject.getString("overview")
            item.rating = jsonObject.getDouble("rating")
            item.release_date = jsonObject.getLong("release_date")
            item.poster_path = jsonObject.getString("poster_path")
            listItems.add(item)
        }
        return listItems
    }

    fun mapTVShowJsonArrayToArrayList(jsonArray: JSONArray): ArrayList<TVShow> {
        val listItems = ArrayList<TVShow>()
        for (i in 0 until jsonArray.length()) {
            val item = TVShow()
            val jsonObject = jsonArray.getJSONObject(i)
            item.id = jsonObject.getInt("id")
            item.name = jsonObject.getString("name")
            item.overview = jsonObject.getString("overview")
            item.vote_average = jsonObject.getDouble("vote_average")
            item.first_air_date = jsonObject.getLong("first_air_date")
            item.poster_path = jsonObject.getString("poster_path")
            listItems.add(item)
        }
        return listItems
    }
}