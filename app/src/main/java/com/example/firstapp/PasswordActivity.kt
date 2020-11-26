package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_password.*


class PasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        getSharedDataAction()

    }
    private fun getSharedDataAction(){
        val value = intent.getStringExtra("login")
        list_login_tex_view.text = value
    }
}