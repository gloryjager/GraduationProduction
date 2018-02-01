package com.production.graduation.data.entity

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

/**
 * Created by student on 2018/01/29.
 */
@JsonSerializable
data class UserEntity(
        @Json(
                name = "id"
        )
        val userId: Int,
        @Json(
                name = "cover_url"
        )
        val coverUrl: String?,
        @Json(
                name = "full_name"
        )
        val fullname: String,
        @Json(
                name = "description"
        )
        val description: String?,
        @Json(
                name = "followers"
        )
        val followers: String,
        @Json(
                name = "email"
        )
        val email: String?
) {

}