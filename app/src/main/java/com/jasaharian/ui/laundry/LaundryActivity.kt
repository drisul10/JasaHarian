package com.jasaharian.ui.laundry

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.R
import com.jasaharian.ui.main.MainActivity
import com.jasaharian.utils.replaceFragmentInActivity
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.setContentView

class LaundryActivity : AppCompatActivity() {
    private val ui = LaundryUI()
    private lateinit var presenter: LaundryPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.setContentView(this)
        setActionBar()

        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.fl_main_content,
                LaundryFragment(), LaundryFragment()::class.simpleName
            )
            .commit()

        val laundryMainFragment = supportFragmentManager
            .findFragmentById(R.id.fl_main_content) as LaundryFragment? ?: LaundryFragment.newInstance().also {
            replaceFragmentInActivity(it, R.id.fl_main_content)
        }

        presenter = LaundryPresenter(laundryMainFragment)
    }

    private fun setActionBar() {
        setSupportActionBar(ui.toolbar)
        supportActionBar?.title = resources.getString(R.string.title_laundry)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        ui.toolbar.setNavigationOnClickListener {
            onPressBack()
        }
    }

    private fun onPressBack() {
        startActivity(intentFor<MainActivity>().newTask().clearTask())
        overridePendingTransition(R.anim.left_in, R.anim.right_out)
        finish()
    }
}