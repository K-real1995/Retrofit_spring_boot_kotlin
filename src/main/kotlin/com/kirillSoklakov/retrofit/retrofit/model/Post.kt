package com.kirillSoklakov.retrofit.retrofit.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.Getter
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
data class Post(
        val userId: Int,
        val id: Int,
        val title: String,
        val completed: Boolean
)