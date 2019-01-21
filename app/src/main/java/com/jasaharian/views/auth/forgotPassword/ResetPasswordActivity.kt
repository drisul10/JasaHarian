package com.jasaharian.views.auth.forgotPassword

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.jasaharian.R
import com.jasaharian.views.auth.login.LoginActivity
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.setContentView

class ResetPasswordActivity : AppCompatActivity() {

    private lateinit var btSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ResetPasswordUI().setContentView(this)

        btSave = findViewById(R.id.bt_save)

        btSave.setOnClickListener {
            startActivity(intentFor<LoginActivity>().newTask().clearTask())
        }
    }
}