package com.example.senac.conversordemoeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        changeToMain()
    }

    fun changeToMain(){
        val intent = Intent(this, MainActivity::class.java)

        Handler().postDelayed({
            intent.change()
        },2000)
    }

    fun Intent.change(){
        startActivity(this)
        finish()
    }
}