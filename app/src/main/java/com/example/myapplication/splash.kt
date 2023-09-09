package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class splash : AppCompatActivity() {
    var act: Activity? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_lay);
        act = this;

        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        runDSplash();
    }


    private fun runDSplash() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(act, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, MainActivity.timer.toLong())
    }

}