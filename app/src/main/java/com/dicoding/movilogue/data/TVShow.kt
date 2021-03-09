package com.dicoding.movilogue.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TVShow(
    var id: Int = 0,
    var name: String? = null,
    var overview: String? = null,
    var vote_average: Double? = null,
    var poster_path: String? = null,
    var first_air_date: String? = null
) : Parcelable {
    constructor(parcel: Parcel) :this() {
        id = parcel.readInt()
        name = parcel.readString()
        overview = parcel.readString()
        vote_average = parcel.readDouble()
        poster_path = parcel.readString()
        first_air_date = parcel.readString()
    }
}