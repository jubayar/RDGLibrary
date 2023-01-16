package net.red.green.rdglibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.red.green.rdgmath.MathActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val textview = findViewById<TextView>(R.id.msg)
        //textview.text = "2 + 5 = " + MathHelper().addition(2, 5)

        val intent = Intent(this, MathActivity::class.java)
        startActivity(intent)
    }
}