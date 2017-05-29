package com.example.luissancar.suma

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.EditorInfo.IME_ACTION_DONE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val op1=findViewById(R.id.ope01) as EditText
        val op2=findViewById(R.id.ope01) as EditText
        val boton=findViewById(R.id.button) as Button
        boton.setEnabled(false)
       boton.setOnClickListener {
           sumar()
       }

        op1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                activarBoton()
            }

            override fun afterTextChanged(s: Editable) {

            }
        })

        op2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                activarBoton()
            }

            override fun afterTextChanged(s: Editable) {

            }
        })




    }

    fun activarBoton(){

        val op1=findViewById(R.id.ope01) as EditText
        val op2=findViewById(R.id.ope02) as EditText
        val boton=findViewById(R.id.button) as Button
        if (op1.getText().length>0 && op2.getText().length>0)
            boton.setEnabled(true)
        else
            boton.setEnabled(false)



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
