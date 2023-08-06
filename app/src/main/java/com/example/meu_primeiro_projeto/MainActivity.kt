package com.example.meu_primeiro_projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.time.measureTimedValue

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtpeso: EditText = findViewById(R.id.edttext_peso)
        val edtaltura: EditText = findViewById(R.id.edttext_altura)


        btnCalcular. setOnClickListener {

           val alturaSt = edtaltura.text.toString()
            val pesost = edtpeso.text.toString()


            if (alturaSt.isNotEmpty() && pesost.isNotEmpty()) {
            val altura : Float = edtaltura.text.toString().toFloat()
            val alturafinal: Float = altura * altura
            val peso: Float = edtpeso.text.toString().toFloat()
            val result: Float = peso / alturafinal

            val intent= Intent(this, ResultActivity::class.java)
                .apply { this
                    putExtra("EXTRA_RESULT", result)
                }
            startActivity(intent)

            }else {
                Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
            }

        }



    }


}

