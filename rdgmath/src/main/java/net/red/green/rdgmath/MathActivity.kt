package net.red.green.rdgmath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import net.red.green.rdgnoti.NotiMsg

class MathActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)

        val msg = NotiMsg()
        Toast.makeText(this, msg.showMsg(), Toast.LENGTH_SHORT).show()
    }
}
