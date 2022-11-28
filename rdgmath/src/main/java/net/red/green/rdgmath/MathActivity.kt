package net.red.green.rdgmath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MathActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = application.packageName
    }
}
