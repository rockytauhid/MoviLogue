package com.dicoding.movilogue.ui.movie

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.movilogue.data.Movie
import com.dicoding.movilogue.utils.Companion
import com.dicoding.movilogue.utils.MappingHelper
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header
import org.json.JSONObject

class MovieViewModel : ViewModel() {
    private var listItems = MutableLiveData<ArrayList<Movie>>()
    private val totalCount = MutableLiveData<Int>()

    fun setListItems() {
        var url = "https://api.themoviedb.org/3/movie/popular"
        val client = Companion.getAsyncHttpClient()
        client.get(url, object : AsyncHttpResponseHandler(){
            override fun onSuccess(
                statusCode: Int,
                headers: Array<Header>,
                responseBody: ByteArray
            ) {
                if (statusCode == 200) {
                    try {
                        val result = String(responseBody)
                        val responseObject = JSONObject(result)
                        val jsonArray = responseObject.getJSONArray("results")
                        listItems.postValue(MappingHelper.mapMovieJsonArrayToArrayList(jsonArray))
                    } catch (e: Exception) {
                        Log.d("Exception", e.message.toString())
                    }
                }
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<Header>,
                responseBody: ByteArray,
                error: Throwable
            ) {
                val errorMessage = when (statusCode) {
                    401 -> "$statusCode : Bad Request"
                    403 -> "$statusCode : Forbidden"
                    404 -> "$statusCode : Not Found"
                    else -> "$statusCode : ${error.message}"
                }
                Log.d("onFailure", errorMessage)
            }

        })
    }

    fun getListItems(): LiveData<ArrayList<Movie>> {
        return listItems
    }

    fun getTotalCount(): LiveData<Int> {
        return totalCount
    }
}