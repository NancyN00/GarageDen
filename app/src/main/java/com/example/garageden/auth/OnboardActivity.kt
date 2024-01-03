package com.example.garageden.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.garageden.databinding.ActivityOnboardBinding

class OnboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener {
            val intent = Intent(this@OnboardActivity, RegistrationActivity::class.java)
            startActivity(intent)

        }

        binding.loginTxt.setOnClickListener {
            val intent = Intent(this@OnboardActivity, LoginActivity::class.java)
            startActivity(intent)

        }



    }
}