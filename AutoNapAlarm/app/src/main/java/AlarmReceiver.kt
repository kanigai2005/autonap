package com.example.autonapalarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // Actions to perform when the alarm goes off
        Toast.makeText(context, "Alarm received!", Toast.LENGTH_SHORT).show()
    }
}