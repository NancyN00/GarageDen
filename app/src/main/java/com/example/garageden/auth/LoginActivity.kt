package com.example.garageden.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.widget.TextView
import com.example.garageden.HomeActivity
import com.example.garageden.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebase: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createAccText.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }

        fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)

        binding.emailloginTxt.text = "nancy@gmail.com".toEditable()
        binding.passwordloginTxt.text = "12345678".toEditable()


        binding.signinBtn.setOnClickListener {

            val mail = binding.emailloginTxt.text.toString().trim()
            val pass = binding.passwordloginTxt.text.toString().trim()


            when {
                TextUtils.isEmpty(mail) -> binding.emailloginTxt.error = "Email is required"
                TextUtils.isEmpty(pass) -> binding.passwordloginTxt.error = "Password is required"

                else -> {
                    Intent(this@LoginActivity, HomeActivity::class.java).also {
                        startActivity(it)
                    }
                }

            }
        }

    }
}