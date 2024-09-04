package com.example.autonapalarm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val heartRateMonitor = HeartRateMonitor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of calling the API in a coroutine
        GlobalScope.launch {
            heartRateMonitor.checkHeartRate()
        }
    }
}