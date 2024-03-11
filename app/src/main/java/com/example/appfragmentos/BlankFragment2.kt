package com.example.appfragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf

class BlankFragment2 : Fragment(R.layout.fragment_blank2) {

    private var nombre:String?=""
    private var edad:Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var datos = view.findViewById<TextView>(R.id.txtDatos)

        datos.text = "su nombre es: $nombre y su edad es: $edad"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState
        )

        nombre=requireArguments().getString(MI_NOMBRE)
        edad=requireArguments().getInt(MI_EDAD)

    }


    companion object{
        private const val MI_NOMBRE="nombre"
        private const val MI_EDAD= "edad"

        fun newInstance(nombre:String , edad:Int)= BlankFragment2().apply {
            arguments = bundleOf(MI_NOMBRE to nombre , MI_EDAD to edad) }
    }



}