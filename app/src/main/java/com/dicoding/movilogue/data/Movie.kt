package com.dicoding.movilogue.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    var id: Int = 0,
    var login: String? = null,
    var avatarUrl: String? = null,
    var url: String? = null,
    var followersUrl: String? = null,
    var followingUrl: String? = null,
    var reposUrl: String? = null,
    var totalCount: Int = 0,
    var deadline: String? = null
) : Parcelable {
    constructor(parcel: Parcel) :this() {
        id = parcel.readInt()
        login = parcel.readString()
        avatarUrl = parcel.readString()
        url = parcel.readString()
        followersUrl = parcel.readString()
        followingUrl = parcel.readString()
        reposUrl = parcel.readString()
        totalCount = parcel.readInt()
    }
}