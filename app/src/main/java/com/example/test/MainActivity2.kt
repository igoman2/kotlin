package com.example.test

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.concurrent.timer

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val count: Int = 0

//        timer(period = 10000, initialDelay = 0) {
//            runOnUiThread {
//                val animator = ValueAnimator.ofFloat(0.35f, 1.0f).setDuration(5000)
//                animator.addUpdateListener { animation: ValueAnimator ->
//                    like_btn3.setProgress(animation.getAnimatedValue() as Float)
//                }
//                animator.start()
//
//                val animator2 = ValueAnimator.ofFloat(0.35f, 1.0f).setDuration(5000)
//                animator.addUpdateListener { animation: ValueAnimator ->
//                    like_btn4.setProgress(animation.getAnimatedValue() as Float)
//                }
//                animator2.start()
//            }
//        }
    }
}