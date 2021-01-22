package com.example.ramazkobakhidze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        init()
    }

    private fun init(){
        loginbutton.setOnClickListener {
            if (Username.text.toString().isNotEmpty() && Password.text.toString().isNotEmpty())
            {
                mainprofile()
            }
        }
    }

    private fun mainprofile(){
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}