package com.example.equistria.vue

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.equistria.R

const val EXTRA_MESSAGE = "com.example.equistria.MESSAGE"

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.textView2)
        val message = editText.text.toString()

        startActivity(intent)
    }

}