package com.jasaharian.views.auth.register

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.jasaharian.R
import com.jasaharian.views.auth.login.LoginActivity
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.setContentView

class RegisterActivity : AppCompatActivity() {

    private lateinit var btRegister: Button
    private lateinit var btLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RegisterUI().setContentView(this)

        btRegister = findViewById(R.id.bt_register)
        btLogin = findViewById(R.id.bt_login)

        btRegister.setOnClickListener {
            startActivity(intentFor<LoginActivity>().newTask().clearTask())
        }

        btLogin.setOnClickListener {
            startActivity(intentFor<LoginActivity>().newTask().clearTask())
        }
    }
}