package com.example.autonapalarm

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("heartRate/{userId}")
    fun getHeartRate(@Path("userId") userId: String): Call<HeartRateResponse>
}