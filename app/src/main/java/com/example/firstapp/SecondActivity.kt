package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        getTextFromMainActivity()
    }

    private fun getTextFromMainActivity(){
        val text = intent.getStringExtra("text")
        showToast("$text")
    }

    private fun showToast(message: String){
        Toast.makeText(this, "", Toast.LENGTH_LONG).show()
    }

}