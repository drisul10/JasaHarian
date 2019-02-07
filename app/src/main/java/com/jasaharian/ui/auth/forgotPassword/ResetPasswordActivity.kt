package com.jasaharian.ui.auth.forgotPassword

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.ui.auth.login.LoginActivity
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.setContentView

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