package com.dicoding.movilogue.utils

import com.dicoding.movilogue.data.Movie
import org.json.JSONArray

object MappingHelper {
    fun mapJsonArrayToArrayList(jsonArray: JSONArray): ArrayList<Movie> {
        val listUsers = ArrayList<Movie>()
        for (i in 0 until jsonArray.length()) {
            val user = Movie()
            val jsonObject = jsonArray.getJSONObject(i)
            user.id = jsonObject.getInt("id")
            user.login = jsonObject.getString("login")
            user.avatarUrl = jsonObject.getString("avatar_url")
            user.url = jsonObject.getString("url")
            user.followersUrl = jsonObject.getString("followers_url")
            user.followingUrl = jsonObject.getString("following_url")
            user.reposUrl = jsonObject.getString("repos_url")
            listUsers.add(user)
        }
        return listUsers
    }
}