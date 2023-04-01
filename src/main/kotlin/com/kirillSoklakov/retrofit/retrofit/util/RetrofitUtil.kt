package com.kirillSoklakov.retrofit.retrofit.util

import com.kirillSoklakov.retrofit.retrofit.constants.RetrofitConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitUtil {

    companion object {
        fun getRetrofitInstace(): Retrofit {
            return Retrofit.Builder().baseUrl(RetrofitConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}