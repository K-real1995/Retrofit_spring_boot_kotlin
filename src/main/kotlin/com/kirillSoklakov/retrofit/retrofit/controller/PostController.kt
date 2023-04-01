package com.kirillSoklakov.retrofit.retrofit.controller

import com.kirillSoklakov.retrofit.retrofit.model.Post
import com.kirillSoklakov.retrofit.retrofit.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1/retrofit")
class PostController(
        val postService: PostService
) {

    @GetMapping("/posts")
    fun fetchPosts(): List<Post> {
        return postService.fetchPost()
    }

    @GetMapping("/post/{id}")
    fun fetchPosts(@PathVariable("id")id:Int): Post {
        return postService.fetchPostById(id)
    }
}