package com.kirillSoklakov.retrofit.retrofit.service

import com.kirillSoklakov.retrofit.retrofit.model.Post
import org.springframework.stereotype.Service

@Service
interface PostService {
    fun fetchPost(): List<Post>
    fun fetchPostById(id:Int): Post
}