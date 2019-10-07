package com.example.cabifyshopapptest.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.cabifyshopapptest.R
import com.google.android.material.snackbar.Snackbar

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Chamar Tela de Compras", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }


}
