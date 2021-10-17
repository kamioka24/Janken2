package com.example.janken2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import com.example.janken2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val GU = 0
    private val CHOKI = 1
    private val PA = 2

    private val janken = IntArray(3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        binding.myGu.setOnClickListener {
            janken[GU] = janken[GU] + 1
            count()
        }

        binding.myChoki.setOnClickListener {
            janken[CHOKI] = janken[CHOKI] + 1
            count()
        }

        binding.myPa.setOnClickListener {
            janken[PA] = janken[PA] + 1
            count()
        }
    }

    private fun count() {
        binding.count.text = janken[GU].toString() + " ," + janken[CHOKI] + " ," + janken[PA]
    }

}