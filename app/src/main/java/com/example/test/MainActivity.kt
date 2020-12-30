package com.example.test

import android.animation.*
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    val TAG: String = "로그"
    val handler = Handler()
    var timeVlaue = 0

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate() called")
        val intent : Intent = Intent(this, MainActivity2::class.java)
        var count: Int = 0


        timer(period = 1000, initialDelay = 0){
            runOnUiThread {

                val localDateTime = LocalDateTime.now()
                val dateTime = localDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
                textView.setText(dateTime)
                count++

                if(count == 6)
                    startActivity(intent)

                buttonView2.setOnClickListener {
                    startActivity(intent)

                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity - onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity - onPause() called")
//        textView.visibility = View.VISIBLE
//        textView.setText("onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity - onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity - onDestroy() called")
    }
}