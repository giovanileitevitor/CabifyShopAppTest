package com.example.cabifyshopapptest.view.ui.ui_carrinho

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cabifyshopapptest.R

class CarrinhoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_carrinho, container, false)

    companion object {
        fun newInstance(): CarrinhoFragment = CarrinhoFragment()
    }
}
