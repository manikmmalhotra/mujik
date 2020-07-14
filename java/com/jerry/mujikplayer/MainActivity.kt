package com.jerry.mujikplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        piano.findViewById<Button>(R.id.piano).setOnClickListener {
            val intent = Intent(this, com.jerry.mujikplayer.piano::class.java)
            // start your next activity
            startActivity(intent)
        }

        drumpad.findViewById<Button>(R.id.drumpad).setOnClickListener {
            val intent = Intent(this, Drumpad::class.java)
            // start your next activity
            startActivity(intent)
        }

        quit.findViewById<Button>(R.id.quit).setOnClickListener {

            System.exit(-1)
        }
    }

}

