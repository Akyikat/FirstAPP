package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getFirstButtonAction()
        
    }

    private fun getFirstButtonAction() {
        button_plus.setOnClickListener{
            var firstValue = first_value.text.toString().toInt()
            var secondValue = second_value.text.toString().toInt()
            var result = firstValue + secondValue
            text_view.text="$result"
            first_value.setText("")
            second_value.setText("")
        }
    }


}




// Что такое переменная? - ячейка памяти для хранения информации
// int, boolean, string, float, char


//github, gitlab - vcs - version control code
