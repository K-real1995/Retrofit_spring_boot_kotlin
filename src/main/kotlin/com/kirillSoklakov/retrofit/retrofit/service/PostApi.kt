package com.kirillSoklakov.retrofit.retrofit.service

import com.kirillSoklakov.retrofit.retrofit.model.Post
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PostApi {
    @GET("/todos")
    fun fetchPosts(): Call<List<Post>>

    @GET("/todos/{id}")
    fun fetchPostById(@Path("id") id:Int):Call<Post>
}