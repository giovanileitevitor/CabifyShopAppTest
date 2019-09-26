package com.example.cabifyshopapptest.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.cabifyshopapptest.R
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT : Long = 8000
    lateinit var mThread: Thread
    var context: SplashScreenActivity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        imgGps.animate()
            .translationXBy(740f)
            .duration = 3000


        Handler().postDelayed({

            startActivity(Intent(this, MainActivity::class.java))

            finish()
        }, SPLASH_TIME_OUT)

    }
}
