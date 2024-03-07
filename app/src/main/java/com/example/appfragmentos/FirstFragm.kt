package com.example.appfragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit


class FirstFragm : Fragment(R.layout.fragment_primer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnIr = view.findViewById<Button>(R.id.btnenviar)

        btnIr.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragmeContainer,BlankFragment2())
                addToBackStack("fA")
            }

        }
    }


}