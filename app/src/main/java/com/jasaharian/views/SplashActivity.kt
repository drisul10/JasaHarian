package com.jasaharian.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.views.home.HomeActivity
import com.jasaharian.views.auth.signIn.SignInActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (1 > 2) {
            startActivity<HomeActivity>()
        } else {
            startActivity<SignInActivity>()
        }

        finish()
    }
}