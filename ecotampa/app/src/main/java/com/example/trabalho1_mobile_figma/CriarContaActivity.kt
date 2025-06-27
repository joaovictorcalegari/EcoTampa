package com.example.trabalho1_mobile_figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CriarContaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout que esta activity vai controlar
        setContentView(R.layout.activity_criar_conta)

        // Encontra os botões e textos clicáveis no layout
        val buttonCriarConta = findViewById<Button>(R.id.btnCreate)
        val textFazerLogin = findViewById<TextView>(R.id.tvDoLogin)

        // Ação para o botão de criar a conta
        buttonCriarConta.setOnClickListener {
            // AQUI você adicionaria a lógica para salvar o novo usuário
            Toast.makeText(this, "Conta criada com sucesso!", Toast.LENGTH_SHORT).show()

            // Após criar a conta, volta para a tela de Login
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
            finish() // Fecha a tela de criação de conta para não voltar para ela
        }

        // Ação para o texto "Já tem uma conta? Faça login"
        textFazerLogin.setOnClickListener {
            // Apenas volta para a tela de Login
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
            finish()
        }
    }
}