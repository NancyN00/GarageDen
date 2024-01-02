package com.example.garageden.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.example.garageden.BeginActivity
import com.example.garageden.R
import com.example.garageden.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding
    private lateinit var firebase : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding =  ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

     binding.createAccText.setOnClickListener {
         val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
         startActivity(intent)
     }

        binding.signinBtn.setOnClickListener {
            val mail = binding.emailloginTxt.text.toString().trim()
            val pass = binding.passwordloginTxt.text.toString().trim()


            when {
                TextUtils.isEmpty(mail) -> binding.emailloginTxt.error = "Email is required"
                TextUtils.isEmpty(pass) -> binding.passwordloginTxt.error = "Password is required"

                else -> {
                    Intent(this@LoginActivity, BeginActivity::class.java).also {
                        startActivity(it)
                    }
                }

            }
        }

    }
}