package com.jasaharian.modules.auth.forgotPassword

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class ForgotPasswordActivity : AppCompatActivity() {

    private val ui = ForgotPasswordUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.setContentView(this)

        ui.btSend.onClick {
            startActivity(intentFor<ResetPasswordActivity>().newTask().clearTask())
        }
    }
}