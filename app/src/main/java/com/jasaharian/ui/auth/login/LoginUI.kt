package com.jasaharian.ui.auth.login

import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import com.jasaharian.R
import org.jetbrains.anko.*

class LoginUI : AnkoComponent<LoginActivity> {

    lateinit var btLogin: Button
    lateinit var btRegister: Button
    lateinit var btForgotPassword: Button

    override fun createView(ui: AnkoContext<LoginActivity>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent) {
                gravity = Gravity.CENTER_VERTICAL
            }
            backgroundColorResource = R.color.colorPrimary

            linearLayout {
                lparams(width = matchParent, height = wrapContent) {
                    orientation = LinearLayout.VERTICAL
                    margin = dip(25)
                }

                editText {
                    id = R.id.et_email
                    hintResource = R.string.hint_email
                }

                editText {
                    id = R.id.et_confirm_password
                    inputType = TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD
                    hintResource = R.string.hint_password
                }

                btLogin = button {
                    id = R.id.bt_login
                    textResource = R.string.bt_login
                }

                btForgotPassword = button {
                    id = R.id.bt_forgot_password
                    textResource = R.string.bt_forgot_password
                    background = null
                }

                linearLayout {
                    lparams(width = matchParent, height = wrapContent) {
                        orientation = LinearLayout.HORIZONTAL
                    }

                    gravity = Gravity.CENTER

                    textView {
                        textResource = R.string.hint_have_no_account
                    }

                    btRegister = button {
                        id = R.id.bt_register
                        textResource = R.string.bt_register
                        background = null
                    }
                }
            }
        }
    }
}