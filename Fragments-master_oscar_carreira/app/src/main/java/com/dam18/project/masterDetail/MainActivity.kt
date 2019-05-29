package com.dam18.project.masterDetail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //************************************************************************** */
        // Añadimos una activity nueva (activity_main -- Layout Resource File)
        // Al cambiar a horizontal sale un toast
        //************************************************************************** */
        if (txtHorizontal != null) {
            toast("Horizontal")

            if (savedInstanceState == null) {
                supportFragmentManager
                        .beginTransaction()
                        .add(R.id.fragmentH, Detalles.newInstance(), "Detalles")
                        .commit()
            }
        }
        //****************************************************************** */
        // Hacemos que cada vez que cliquemos el boton cambiemos de activity
        //****************************************************************** */
        btnChange.setOnClickListener {
            if (txtHorizontal != null) {
                supportFragmentManager
                        .beginTransaction()
                        .add(R.id.fragmentH, Detalles.newInstance(), "Detalles")
                        .commit()
            }else{
                startActivity(intentFor<New>("id" to 5).singleTop())
            }
        }
    }
}
