package com.kirillSoklakov.retrofit.retrofit.service.impl

import com.kirillSoklakov.retrofit.retrofit.model.Post
import com.kirillSoklakov.retrofit.retrofit.service.PostApi
import com.kirillSoklakov.retrofit.retrofit.service.PostService
import com.kirillSoklakov.retrofit.retrofit.util.RetrofitUtil
import org.springframework.stereotype.Component
import retrofit2.Call
import retrofit2.Retrofit

@Component
class PostServiceImpl(
        private val retrofit: Retrofit = RetrofitUtil.getRetrofitInstace(),
        private val postApi: PostApi = retrofit.create(PostApi::class.java)
): PostService {

    override fun fetchPost(): List<Post> {
        val fetchPostCall: Call<List<Post>> = postApi.fetchPosts()
        return fetchPostCall.execute().body()!!
    }

    override fun fetchPostById(id: Int): Post {
        val fetchPostCall: Call<Post> = postApi.fetchPostById(id)
        return fetchPostCall.execute().body()!!
    }
}
