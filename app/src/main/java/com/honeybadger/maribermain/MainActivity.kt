package com.honeybadger.maribermain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.honeybadger.maribermain.activity.HomeActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }, 1000)

    }
}
