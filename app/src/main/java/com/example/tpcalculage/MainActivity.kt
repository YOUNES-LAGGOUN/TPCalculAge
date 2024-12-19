package com.example.tpcalculage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etBirthYear = findViewById<EditText>(R.id.etBirthYear)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)


        btnCalculate.setOnClickListener {
            val birthYearStr = etBirthYear.text.toString()


            if (birthYearStr.isEmpty()) {
                tvResult.text = "anne de nisence"
                return@setOnClickListener
            }

            val birthYear = birthYearStr.toInt()
            val thisyear = Calendar.getInstance().get(Calendar.YEAR)


            val age = thisyear - birthYear


            if (age >= 0) {
                tvResult.text = " age = $age ans."
            } else {
                tvResult.text = "invalide."
            }
        }
    }
}