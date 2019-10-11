package com.example.cabifyshopapptest.view.ui.ui_finalizar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.cabifyshopapptest.R


class FinalizarFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_finalizar, container, false)

    companion object {
        fun newInstance(): FinalizarFragment = FinalizarFragment()
    }
}
