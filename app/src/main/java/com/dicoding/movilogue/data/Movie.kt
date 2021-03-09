package com.dicoding.movilogue.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
        var id: Int = 0,
        var title: String? = null,
        var overview: String? = null,
        var vote_average: Double? = null,
        var poster_path: String? = null,
        var release_date: String? = null
) : Parcelable {
    constructor(parcel: Parcel) :this() {
        id = parcel.readInt()
        title = parcel.readString()
        overview = parcel.readString()
        vote_average = parcel.readDouble()
        poster_path = parcel.readString()
        release_date = parcel.readString()
    }
}