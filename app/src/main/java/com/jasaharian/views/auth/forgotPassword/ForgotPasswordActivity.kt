package com.jasaharian.views.auth.forgotPassword

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.jasaharian.R
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.setContentView

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var btSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ForgotPasswordUI().setContentView(this)

        btSend = findViewById(R.id.bt_send)

        btSend.setOnClickListener {
            startActivity(intentFor<ResetPasswordActivity>().newTask().clearTask())
        }
    }
}