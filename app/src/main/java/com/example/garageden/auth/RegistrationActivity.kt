package com.example.garageden.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.garageden.R
import com.example.garageden.databinding.ActivityRegistrationBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.haveaccTxt.setOnClickListener {
            val intent = Intent(this@RegistrationActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.signupBtn.setOnClickListener {
            val usermail = binding.emailregEdt.text.toString().trim()
            val userpass = binding.passregEdt.text.toString().trim()

            auth.createUserWithEmailAndPassword(usermail, userpass).addOnCompleteListener {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Account Registered", Toast.LENGTH_SHORT).show()
                    Log.d("Succ-->", it.toString())
                    startActivity((Intent(this, LoginActivity::class.java)))

                } else {
                    Toast.makeText(this, "Failed, try again!", Toast.LENGTH_SHORT).show()
                    Log.d("Failed--->", it.toString())
                }
            }
        }
    }
}


//usermail is used as reference to edittext in the widget
//binding.emailregEdt.text  retrieves the text entered by the user in the edittext field
//tostring() is used to convert the editable
//trim()function to remove leading and trailing whitespaces and then checks if the resulting string is empty

//   usermail.text = "nancy@gmail.com"
//   userpas.text = "12345678"