package com.example.trabalho1_mobile_figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Certifique-se de que a linha abaixo está EXATAMENTE assim
class EsqueciActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_senha)

        val buttonRecuperar = findViewById<Button>(R.id.btnSendLink)
        val buttonVoltar = findViewById<ImageButton>(R.id.btnBack)

        buttonRecuperar.setOnClickListener {
            Toast.makeText(this, "Link de recuperação enviado!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
            finish()
        }

        buttonVoltar.setOnClickListener {
            finish()
        }
    }
}