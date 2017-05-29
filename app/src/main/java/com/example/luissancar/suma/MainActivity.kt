package com.example.luissancar.suma

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton=findViewById(R.id.button) as Button
       boton.setOnClickListener {
           sumar()
       }
    }

    fun sumar() {
        val op1=findViewById(R.id.ope01) as EditText
        val op2=findViewById(R.id.ope02) as EditText
        val textV=findViewById(R.id.resul) as TextView
        var res:Int
        res=op1.getText().toString().toInt()+op2.getText().toString().toInt()
        textV.setText(res.toString())
    }
}
