package com.apps.nb2998.mycalckotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var num1 = 0
        var num2 = 0

        verticalLayout {
            var et1 = editText {
                id = R.id.et1
                hint = "Enter 1st number"
                width = wrapContent
                height = wrapContent
                inputType = InputType.TYPE_CLASS_NUMBER
            }

            var et2 = editText {
                id = R.id.et2
                hint = "Enter 1st number"
                width = wrapContent
                height = wrapContent
                inputType = InputType.TYPE_CLASS_NUMBER
            }

            var tvRes = textView {
                id = R.id.tvRes
                text = ""
            }

            linearLayout {
                button {
                    id = R.id.btn_add
                    text = "+"
                    width = wrapContent
                    height = wrapContent
                    onClick {
                        num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
                        num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
                        tvRes.text = (num1 + num2).toString()
                    }
                }

                button {
                    id = R.id.btn_sub
                    text = "-"
                    width = wrapContent
                    height = wrapContent
                    onClick {
                        num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
                        num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
                        tvRes.text = (num1 - num2).toString()
                    }
                }

                button {
                    id = R.id.btn_mult
                    text = "*"
                    width = wrapContent
                    height = wrapContent
                    onClick {
                        num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
                        num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
                        tvRes.text = (num1 * num2).toString()
                    }
                }
                button {
                    id = R.id.btn_divide
                    text = "/"
                    width = wrapContent
                    height = wrapContent
                    onClick {
                        num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
                        num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
                        tvRes.text = if (num2 != 0) (num1 / num2).toString() else "Not possible"
                    }
                }
            }
        }

//        var btnAdd = findViewById<Button>(R.id.btnAdd)  OR var btn : Button = findViewById(R.id.btnAdd) can also be done

//        btnAdd.setOnClickListener{
//            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
//            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
//            tvRes.text = (num1 + num2).toString()
//        }
//
//        btnSub.setOnClickListener{
//            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
//            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
//            tvRes.text = (num1 - num2).toString()
//        }
//
//        btnMultiply.setOnClickListener {
//            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
//            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
//            tvRes.text = (num1 * num2).toString()
//        }
//
//        btnDivide.setOnClickListener {
//            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
//            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
//            tvRes.text = if (num2 != 0) (num1 / num2).toString() else "Not possible"
//        }
    }
}
