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

        binding.calcular.setOnClickListener{  }
    }

    }

