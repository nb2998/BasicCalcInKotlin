package com.apps.nb2998.mycalckotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.Gravity
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView


class MainActivity : AppCompatActivity() {

    lateinit var tvRes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var num1 = 0
        var num2 = 0

        verticalLayout {
            val et1 = editText {
                id = R.id.et1
                hint = "Enter 1st number"
                width = wrapContent
                height = wrapContent
                inputType = InputType.TYPE_CLASS_NUMBER
            }

            val et2 = editText {
                id = R.id.et2
                hint = "Enter 1st number"
                width = wrapContent
                height = wrapContent
                inputType = InputType.TYPE_CLASS_NUMBER
            }

            cardView {
                verticalLayout {
                    padding = dip(10)
                    tvRes = textView {
                        id = R.id.tvRes
                        text = ""
                        textSize = 36F
                        gravity = Gravity.CENTER

                    }.lparams {
                        gravity = Gravity.CENTER
                        width = matchParent
                        height = wrapContent
                    }
                }
            }.lparams{
                margin = dip(20)
                width= matchParent
                height = wrapContent
            }

            verticalLayout {
                linearLayout {
                    button {
                        id = R.id.btn_add
                        text = "+"
                        onClick {
                            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
                            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
                            tvRes.text = (num1 + num2).toString()
                        }
                    }.lparams {
                        width = dip(0)
                        height = wrapContent
                        weight = 1F
                    }

                    button {
                        id = R.id.btn_sub
                        text = "-"
                        onClick {
                            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
                            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
                            tvRes.text = (num1 - num2).toString()
                        }
                    }.lparams {
                        width = dip(0)
                        height = wrapContent
                        weight = 1F
                    }

                }
                linearLayout {
                    button {
                        id = R.id.btn_mult
                        text = "*"
                        onClick {
                            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
                            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
                            tvRes.text = (num1 * num2).toString()
                        }
                    }.lparams {
                        width = dip(0)
                        height = wrapContent
                        weight = 1F
                    }
                    button {
                        id = R.id.btn_divide
                        text = "/"
                        onClick {
                            num1 = if (et1.text.isNotEmpty()) et1.text.toString().toInt() else 0
                            num2 = if (et2.text.isNotEmpty()) et2.text.toString().toInt() else 0
                            tvRes.text = if (num2 != 0) (num1 / num2).toString() else "Not possible"
                        }
                    }.lparams {
                        width = dip(0)
                        height = wrapContent
                        weight = 1F
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
