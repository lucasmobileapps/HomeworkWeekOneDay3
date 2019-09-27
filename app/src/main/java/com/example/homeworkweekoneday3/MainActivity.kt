package com.example.homeworkweekoneday3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.btnReverseText -> populateLabel()

        }
    }

    fun populateLabel() {
        var text = etText.text.toString()

        tvText.text = reverseStr(text)

    }


    //Reverse string recursively
    //fun reverseStr(str: String): String{
    //    if(str.isEmpty())
    //        return str
    //    return reverseStr(str.substring(1)) + str[0]
    //}


    //Reverse string with function
    fun reverseStr(str: String): String{
        return str.reversed()
    }

}
