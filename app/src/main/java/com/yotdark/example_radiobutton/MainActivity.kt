package com.yotdark.example_radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val radioGroup: RadioGroup by lazy {
        findViewById(R.id.radio_group)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioEvent()
    }

    private fun radioEvent(){
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            Toast.makeText(this@MainActivity, "check: ${findViewById<RadioButton>(checkedId).tag}", Toast.LENGTH_SHORT).show()
        }
    }
}