package com.example.cabifyshopapptest.view

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.cabifyshopapptest.R
import com.example.cabifyshopapptest.view.ui_carrinho.CarrinhoFragment
import com.example.cabifyshopapptest.view.ui_finalizar.FinalizarFragment
import com.example.cabifyshopapptest.view.ui_home.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    lateinit var toolbar : ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = supportActionBar!!

        val bottomNavigation : BottomNavigationView = findViewById(R.id.navigationView)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                toolbar.title = "Início"
                val homeFragment = HomeFragment.newInstance()
                openFragment(homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_carrinho -> {
                toolbar.title = "Meus pedidos"
                val carrinhoFragment = CarrinhoFragment.newInstance()
                openFragment(carrinhoFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_finalizar -> {
                toolbar.title = "Pagamento"
                val finalizarFragment = FinalizarFragment.newInstance()
                openFragment(finalizarFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}