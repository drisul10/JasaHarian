package com.jasaharian.modules.auth.register

import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import com.jasaharian.R
import org.jetbrains.anko.*

class RegisterUI : AnkoComponent<RegisterActivity> {

    lateinit var btRegister: Button
    lateinit var btLogin: Button

    override fun createView(ui: AnkoContext<RegisterActivity>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent) {
                gravity = Gravity.CENTER_VERTICAL
            }

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
                    id = R.id.et_password
                    inputType = TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD
                    hintResource = R.string.hint_password
                }

                editText {
                    id = R.id.et_password
                    inputType = TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD
                    hintResource = R.string.hint_confirm_password
                }

                btRegister = button {
                    id = R.id.bt_register
                    textResource = R.string.bt_register
                }

                linearLayout {
                    lparams(width = matchParent, height = wrapContent) {
                        orientation = LinearLayout.HORIZONTAL
                    }

                    gravity = Gravity.CENTER

                    textView {
                        textResource = R.string.hint_have_account
                    }

                    btLogin = button {
                        id = R.id.bt_login
                        textResource = R.string.bt_login
                        background = null
                    }
                }
            }
        }
    }
}