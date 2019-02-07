package com.jasaharian.ui.auth.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.ui.auth.forgotPassword.ForgotPasswordActivity
import com.jasaharian.ui.auth.register.RegisterActivity
import com.jasaharian.ui.main.MainActivity
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.setContentView

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