package com.jasaharian.modules

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.modules.main.MainActivity
import com.jasaharian.modules.auth.login.LoginActivity
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