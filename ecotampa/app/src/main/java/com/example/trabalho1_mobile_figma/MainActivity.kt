package com.example.trabalho1_mobile_figma

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            // CORRIGIDO: Navega para a classe com o nome correto (ActivityLogin)
            val loginIntent = Intent(this, ActivityLogin::class.java)
            startActivity(loginIntent)
            finish()
        }, 2000) // 2 segundos de espera
    }
}