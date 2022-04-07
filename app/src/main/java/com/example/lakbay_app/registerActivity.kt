package com.example.lakbay_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class registerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegLogin.setOnClickListiner {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_from_left)
    }
}