package com.example.trabalho1_mobile_figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// GARANTA QUE O NOME DA CLASSE NESTA LINHA ESTEJA CORRETO
class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonEntrar = findViewById<Button>(R.id.btnEnter)
        val buttonCriarConta = findViewById<Button>(R.id.button)
        val buttonEsqueciSenha = findViewById<Button>(R.id.vForgotPasswordt)

        // Botão ENTRAR
        buttonEntrar.setOnClickListener{
            // Lógica de login
            Toast.makeText(this, "Botão Entrar Clicado!", Toast.LENGTH_SHORT).show()
        }

        // Botão CRIAR CONTA
        buttonCriarConta.setOnClickListener{
            // Navega para a tela de Criar Conta
            startActivity(Intent(this, CriarContaActivity::class.java))
        }

        // Botão ESQUECI MINHA SENHA
        buttonEsqueciSenha.setOnClickListener{
            // Navega para a tela de Recuperar Senha
            startActivity(Intent(this, EsqueciActivity::class.java))
        }
    }
}