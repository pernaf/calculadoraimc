package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editPeso = findViewById<TextInputEditText>(R.id.edit_peso)
        val editAltura = findViewById<TextInputEditText>(R.id.edit_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val pesoStr: String = editPeso.text.toString()
            val alturaStr: String = editAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                Snackbar
                    .make(
                    editPeso,
                    "Preencha os campos vazios!",
                    Snackbar.LENGTH_LONG
                ) .show()

            }else{
                val peso: Float = pesoStr.toFloat()
                val altura: Float = alturaStr.toFloat()

                val altura2 = altura * altura
                val resultado = peso / altura2


                val intent = Intent (this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)

                println(resultado)
            }
        }
    }
}