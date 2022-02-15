package com.conamobile.shapableimageviewfunction

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView:TextView = findViewById(R.id.textView)
        val textView2:TextView = findViewById(R.id.textView2)

        val text = "I would #like to do #something similar to the #Twitter app"
        val text2 = "I would like to do something similar to the https://twitter.com app"

        val spannable: Spannable = SpannableString(text)
        spannable.setSpan(
            ForegroundColorSpan(Color.GREEN),
            8,
            13,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(
            ForegroundColorSpan(Color.GREEN),
            20,
            30,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(
            ForegroundColorSpan(Color.GREEN),
            46,
            54,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textView.text = spannable

        val spannable2: Spannable = SpannableString(text2)
        spannable2.setSpan(
            ForegroundColorSpan(Color.BLUE),
            44,
            text2.length-4,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textView2.text = spannable2
    }
}