package com.sriyank.animationsdemo

import android.content.Context
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.core.os.postDelayed

object WarningHelper {

    fun Tick(context:Context , ms:Int){

        val layout = LayoutInflater.from(context).inflate(R.layout.tick , null)
        val imgTick = layout.findViewById<ImageView>(R.id.imgTick)

        try {

            imgTick.setImageResource(R.drawable.avd_tick)
            val avd = imgTick.drawable as AnimatedVectorDrawable
            avd.start()
            val alert = AlertDialog.Builder(context )  //Alert Dailog
            alert.setView(layout)
           val al = alert.show()
            al.window!!.setBackgroundDrawableResource(R.color.transparent)  //Dialog background to transparent
            al.window!!.setLayout(600 , 670)            //Dialog layout size

            //Timer
            val mainHandler = Handler(Looper.getMainLooper())  // import the handler as os
            mainHandler.postDelayed(object : Runnable {
                override fun run() {
                   al.dismiss()
                }
            },ms.toLong())

        }catch (e:Exception){

            Log.d("Error1" , e.toString())

        }
    }

    fun Cross(context: Context , ms: Int){

        val layout = LayoutInflater.from(context).inflate(R.layout.cross , null)
        val imgCross = layout.findViewById<ImageView>(R.id.imgCross)

        try {

            imgCross.setImageResource(R.drawable.avd_cross2)
            val avd = imgCross.drawable as AnimatedVectorDrawable
            avd.start()
            val alert = AlertDialog.Builder(context)  //Alert Dialog
            alert.setView(layout)
            val al = alert.show()
            al.window!!.setBackgroundDrawableResource(R.color.transparent) //Dialog background to Transparent
            al.window!!.setLayout(600 , 600)     //Dialog Layout size

            //Timer
            val mainHandler = Handler(Looper.getMainLooper())  // import the handler as os
            mainHandler.postDelayed(object : Runnable {
                override fun run() {
                    al.dismiss()
                }
            },ms.toLong())

        }catch (e:Exception){

            Log.d("Error1" , e.toString())

        }

    }

}

