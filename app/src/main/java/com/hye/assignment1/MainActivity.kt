package com.hye.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //intent 사용해서 두번째 액티비티로 넘어갈 수 있도록 설정 (화면 전환)
        val Btn1 = findViewById<Button>(R.id.Btn1)
        Btn1.setOnClickListener {
            Toast.makeText(this,"1번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent1 = Intent(this,ClickActivity::class.java)
            startActivity(intent1)
        }

        //버튼2 클릭시 토스트 메시지 보이기
        val Btn2 = findViewById<Button>(R.id.Btn2)
        Btn2.setOnClickListener {
            Toast.makeText(this,"BTN2", Toast.LENGTH_LONG).show()

        }

        //버튼3 클릭시 노란 화면에 텍스트 띄우기기
        val tv: TextView = findViewById(R.id.tv_hello)
        val Btn3 = findViewById<Button>(R.id.Btn3)

        Btn3.setOnClickListener {
            tv.setText("Hello Android")
            //tv.text = "Hello Android"

        }

    }


}