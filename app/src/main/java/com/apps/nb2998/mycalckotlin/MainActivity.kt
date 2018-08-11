package com.apps.nb2998.mycalckotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1 = 0
        var num2 = 0

//        var btnAdd = findViewById<Button>(R.id.btnAdd)  OR var btn : Button = findViewById(R.id.btnAdd) can also be done

        btnAdd.setOnClickListener({
            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
            tvRes.text = (num1 + num2).toString()
        })

        btnSub.setOnClickListener({
            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
            tvRes.text = (num1 - num2).toString()
        })

        btnMultiply.setOnClickListener({
            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
            tvRes.text = (num1 * num2).toString()
        })

        btnDivide.setOnClickListener({
            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
            tvRes.text = if (num2 != 0) (num1 / num2).toString() else "Not possible"
        })
    }
}
