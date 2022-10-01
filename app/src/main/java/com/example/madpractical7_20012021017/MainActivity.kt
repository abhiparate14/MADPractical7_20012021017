package com.example.madpractical7_20012021017

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//private fun setAlarm(millisTime: Long, str: String)
//{
//    val intent = Intent(this, AlarmBroadcastReceiver::class.java)
//    intent.putExtra("Service1", str)
//    val pendingIntent = PendingIntent.getBroadcast(applicationContext)
//}