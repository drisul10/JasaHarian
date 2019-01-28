package com.jasaharian.modules.auth.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.modules.auth.forgotPassword.ForgotPasswordActivity
import com.jasaharian.modules.auth.register.RegisterActivity
import com.jasaharian.modules.main.MainActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LoginActivity : AppCompatActivity() {

    private val ui = LoginUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.setContentView(this)

        ui.btLogin.onClick {
            startActivity(intentFor<MainActivity>().newTask().clearTask())
        }

        ui.btRegister.onClick {
            startActivity(intentFor<RegisterActivity>().newTask().clearTask())
        }

        ui.btForgotPassword.onClick {
            startActivity(intentFor<ForgotPasswordActivity>())
        }
    }
}