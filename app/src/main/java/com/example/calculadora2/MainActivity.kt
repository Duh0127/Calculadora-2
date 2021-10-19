package com.example.calculadora2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora2.databinding.ActivityMainBinding
import android.view.View
import android.widget.EditText
import android.widget.Toast

const val EXTRA_MESSAGE = "com.example.myfistapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcular.setOnClickListener{ calcularNum() }
    }

    fun calcularNum() {

        val numeroUm = binding.n1.text.toString()
        val n1 = numeroUm.toDouble()

        val numeroDois = binding.n2.text.toString()
        val n2 = numeroDois.toDouble()

        val radioSelecionado = binding.GrupoRadioComandos.checkedRadioButtonId
        val opcaoCalculos = when (radioSelecionado){
            R.id.RadioSoma -> n1 + n2
            R.id.RadioMultiplicacao -> n1 * n2
            R.id.radioDivisao -> n1 / n2
            else -> n1 - n2
        }

        val toast = Toast.makeText (this, "Calculo realizado com sucesso", Toast.LENGTH_SHORT).show()


        binding.resultado.text = opcaoCalculos.toString()

    }






}
