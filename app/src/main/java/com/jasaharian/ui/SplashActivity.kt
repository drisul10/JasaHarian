package com.jasaharian.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.ui.auth.login.LoginActivity
import com.jasaharian.ui.main.MainActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (1 > 2) {
            startActivity<MainActivity>()
        } else {
            startActivity<LoginActivity>()
        }

        finish()
    }
}