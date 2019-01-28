package com.jasaharian.modules.auth.forgotPassword

import android.text.InputType
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import com.jasaharian.R
import org.jetbrains.anko.*

class ResetPasswordUI : AnkoComponent<ResetPasswordActivity> {

    lateinit var btSave: Button

    override fun createView(ui: AnkoContext<ResetPasswordActivity>) = with(ui) {
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
                    id = R.id.et_new_password
                    inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                    hintResource = R.string.hint_new_password
                }

                editText {
                    id = R.id.et_confirm_password
                    inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                    hintResource = R.string.hint_password
                }

                btSave = button {
                    id = R.id.bt_save
                    textResource = R.string.bt_save
                }
            }
        }
    }

}