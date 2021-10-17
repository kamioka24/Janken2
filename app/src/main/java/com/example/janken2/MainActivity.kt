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

//    private val janken = IntArray(3)
    private val jankenList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jankenList.add(0) // GU
        jankenList.add(0) // CHOKI
        jankenList.add(0) // PA

        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        binding.myGu.setOnClickListener {
//            janken[GU] = janken[GU] + 1
            jankenList.set(GU, jankenList.get(GU) + 1)
            count()
        }

        binding.myChoki.setOnClickListener {
//            janken[CHOKI] = janken[CHOKI] + 1
            jankenList.set(CHOKI, jankenList.get(CHOKI) + 1)
            count()
        }

        binding.myPa.setOnClickListener {
//            janken[PA] = janken[PA] + 1
            jankenList.set(PA, jankenList.get(PA) + 1)
            count()
        }

        binding.reset.setOnClickListener {
            reset()
        }
    }

    private fun count() {
//        binding.count.text = janken[GU].toString() + " ," + janken[CHOKI] + " ," + janken[PA]
        binding.count.text = jankenList.get(GU).toString() + " ," + jankenList.get(CHOKI) + " ," + jankenList.get(PA)

        var sum = 0

//        for (i in 0 until jankenList.size) {
//            sum += jankenList[i]
//        }

        for (i in jankenList.indices) {
            sum += jankenList[i]
        }

        binding.sum.text = "合計：" + sum.toString()
    }

    private fun reset() {
        jankenList.set(GU, 0)
        jankenList.set(CHOKI, 0)
        jankenList.set(PA, 0)

        binding.count.text = "0 ,0 ,0"
        binding.sum.text = "合計：0"
    }
}