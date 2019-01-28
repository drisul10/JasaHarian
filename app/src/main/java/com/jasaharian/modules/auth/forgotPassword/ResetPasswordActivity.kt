package com.jasaharian.modules.auth.forgotPassword

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.modules.auth.login.LoginActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class ResetPasswordActivity : AppCompatActivity() {

    private val ui = ResetPasswordUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.setContentView(this)

        ui.btSave.onClick {
            startActivity(intentFor<LoginActivity>().newTask().clearTask())
        }
    }
}