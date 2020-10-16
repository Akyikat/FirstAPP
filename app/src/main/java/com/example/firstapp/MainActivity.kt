package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /*
   1. Всегда следить за пробелами и вложенностью
   2. Между функциями должен быть отступ в одну строчку
   3. Все переменные должны называться по смыслу
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // text_view.text = getName(60)
       // Log.v("CREATED_NAME", getName(60))

        changeTextAction()
        
    }

    private fun changeTextAction() {
        change.setOnClickListener {
            var value = edit_text.text.toString()
            text_view.text = value
         //   edit_text.setText("")
            edit_text.text.clear()
            change.setTextColor(resources.getColor(R.color.changeButtonText))

        }
    }

}
    //var - переменная age - название;
    // Int - наследование или принадлежность к определенному типу,
    // = 40 - значение

    //var age: Int = 40
   // var isMarried: Boolean = false
   // var createdName: String = "Romeo"
   // var size: Short = 35
   // var length: Byte = 4
   // var weight: Double = 3.785

   // fun getName(age: Int): String {
    //    return createdName + age
  //  }
//}


// Что такое переменная? - ячейка памяти для хранения информации
// int, boolean, string, float, char


//github, gitlab - vcs - version control code
