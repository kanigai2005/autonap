package com.example.autonapalarm

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HeartRateMonitor {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.example.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiService = retrofit.create(ApiService::class.java)

    suspend fun checkHeartRate() {
        withContext(Dispatchers.IO) {
            val response = apiService.getHeartRate()
            if (response.isSuccessful) {
                val heartRateResponse = response.body()
                if (heartRateResponse != null) {
                    // Process the heart rate data
                }
            }
        }
    }
}