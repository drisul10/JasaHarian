package com.jasaharian.modules.auth.register

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.modules.auth.login.LoginActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class RegisterActivity : AppCompatActivity() {

    private val ui = RegisterUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.setContentView(this)

        ui.btRegister.onClick {
            startActivity(intentFor<LoginActivity>().newTask().clearTask())
        }

        ui.btLogin.onClick {
            startActivity(intentFor<LoginActivity>().newTask().clearTask())
        }
    }
}