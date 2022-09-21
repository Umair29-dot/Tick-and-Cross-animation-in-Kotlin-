package com.sriyank.animationsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnTick = findViewById<Button>(R.id.btnTick)
        val btnCross = findViewById<Button>(R.id.btnCross)


      btnTick.setOnClickListener {
          
          WarningHelper.Tick(this , 2000)

      }

        btnCross.setOnClickListener {

            WarningHelper.Cross(this , 2000)

        }

    }
}

