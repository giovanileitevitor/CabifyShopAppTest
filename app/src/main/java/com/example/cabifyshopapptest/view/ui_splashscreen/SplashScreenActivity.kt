package com.example.cabifyshopapptest.view.ui_splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.cabifyshopapptest.R
import com.example.cabifyshopapptest.view.ui_login.LoginActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        screenControl()

        setContentView(R.layout.activity_splash_screen)

        //Controle de animacao dos objetos da tela
        imgGps.animate()
            .translationXBy(740f)
            .duration = 3000


        Handler().postDelayed({

            startActivity(Intent(this, LoginActivity::class.java))

            finish()
        }, SPLASH_TIME_OUT)
    }


    //Método para Setar a tela em full Screen
    private fun screenControl(){
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }
}
