package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editPeso = findViewById<TextInputEditText>(R.id.edit_peso)
        val editAltura = findViewById<TextInputEditText>(R.id.edit_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso: Float = editPeso.text.toString().toFloat()
            val altura: Float = editAltura.text.toString().toFloat()

            val altura2 = altura * altura
            val resultado = peso / altura2

            println(resultado)
        }
    }
}