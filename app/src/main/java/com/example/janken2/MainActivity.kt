package com.example.janken2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val GU = 0
    private val CHOKI = 1
    private val PA = 2

    private val janken = IntArray(3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myGu = findViewById<ImageButton>(R.id.my_gu)

        myGu.setOnClickListener {
            janken[GU] = janken[GU] + 1
            count()
        }

        val myChoki = findViewById<View>(R.id.my_choki) as ImageButton

        myChoki.setOnClickListener {
            janken[CHOKI] = janken[CHOKI] + 1
            count()
        }

        val myPa = findViewById<View>(R.id.my_pa) as ImageButton

        myPa.setOnClickListener {
            janken[PA] = janken[PA] + 1
            count()
        }
    }

    private fun count() {
        val textView = findViewById<TextView>(R.id.count)
        textView.text = janken[GU].toString() + " ," + janken[CHOKI] + " ," + janken[PA]
    }

}