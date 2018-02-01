package com.production.graduation.data.api

import com.production.graduation.data.entity.UserEntity
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by student on 2018/01/29.
 */
interface ApiService {
    @GET
    fun getUserList(@Url url: String): Single<List<UserEntity>>

    @GET
    fun getUserDetail(@Url url: String): Single<UserEntity>
}
