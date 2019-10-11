package com.example.cabifyshopapptest.view.ui.ui_finalizar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast

import com.example.cabifyshopapptest.R
import com.example.cabifyshopapptest.view.ui.ui_home.HomeFragment
import kotlinx.android.synthetic.main.fragment_finalizar.*


class FinalizarFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_finalizar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        initVars()
        initActions()
    }

    fun initVars(){
        //val radioGroup = findViewById<RadioGroup>(R.id.radio_group)
    }

    fun initActions(){
        btn_pagar.setOnClickListener {


            Toast.makeText(getContext(), "Pagamento finalizado", Toast.LENGTH_SHORT).show()

        }
    }

}
