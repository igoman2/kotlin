package com.Han.HanNewYear

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {

    lateinit var mediaPlayer : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
         mediaPlayer = MediaPlayer.create(this, R.raw.sound2)
        println("hihi")
        mediaPlayer.start()
        print("cccc")
    }

    override fun onResume() {
        super.onResume()
        println("hihi")
        mediaPlayer.start()
        print("cccc")
    }

//    override fun onRestart() {
//        super.onRestart()
//        println("hihi")
//        mediaPlayer.start()
//        print("cccc")
//    }

    override fun onPause() {
        super.onPause()
        mediaPlayer.release()
    }


//        try {
//            val notification: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALL)
//            val r1: Ringtone = RingtoneManager.getRingtone(this, notification)
//            r1.play()
//        }
//        catch (e: Exception){
//            e.printStackTrace()
//        }

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
