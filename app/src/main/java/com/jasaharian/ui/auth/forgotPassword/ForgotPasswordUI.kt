package com.jasaharian.ui.auth.forgotPassword

import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import com.jasaharian.R
import org.jetbrains.anko.*

class ForgotPasswordUI : AnkoComponent<ForgotPasswordActivity> {

    lateinit var btSend: Button

    override fun createView(ui: AnkoContext<ForgotPasswordActivity>) = with(ui) {
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

                btSend = button {
                    id = R.id.bt_send
                    textResource = R.string.bt_send
                }
            }
        }
    }
}