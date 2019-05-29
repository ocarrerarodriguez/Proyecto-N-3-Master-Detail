package com.dam18.project.pruebas

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Detalles : Fragment() {
    //*************************************************/
    //Este es el equivalente del onCreate del activity
    //*************************************************/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    //************************************************************/
    //Esto es para crear la vista, para hacer visible el fragment
    //************************************************************/
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalles, container, false)
    }

    companion object {

        fun newInstance():Detalles {
            return Detalles()
        }
    }
}