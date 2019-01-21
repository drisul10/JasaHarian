package com.jasaharian.views.auth.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.jasaharian.R
import com.jasaharian.views.auth.forgotPassword.ForgotPasswordActivity
import com.jasaharian.views.auth.register.RegisterActivity
import com.jasaharian.views.home.HomeActivity
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.setContentView

class LoginActivity : AppCompatActivity() {

    private lateinit var btLogin: Button
    private lateinit var btRegister: Button
    private lateinit var btForgotPassword: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoginUI().setContentView(this)

        btLogin = findViewById(R.id.bt_login)
        btRegister = findViewById(R.id.bt_register)
        btForgotPassword = findViewById(R.id.bt_forgot_password)

        btLogin.setOnClickListener {
            startActivity(intentFor<HomeActivity>().newTask().clearTask())
        }

        btRegister.setOnClickListener {
            startActivity(intentFor<RegisterActivity>().newTask().clearTask())
        }

        btForgotPassword.setOnClickListener {
            startActivity(intentFor<ForgotPasswordActivity>())
        }
    }
}