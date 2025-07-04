package com.example.trabalho1_mobile_figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class activity_recuperar_senha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_senha)

        val buttonrecuperar = findViewById<Button>(R.id.btnSendLink)
        buttonrecuperar.setOnClickListener {
            startActivity(Intent(this, activity_criar_conta::class.java))
        }
        val botaoVoltar = findViewById<ImageButton>(R.id.btnBack)
        botaoVoltar.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()  // Volta para a activity anterior
        }
    }
}