package com.jerry.mujikplayer

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_drumpad.*

class Drumpad : AppCompatActivity() {

    var sp:SoundPool? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drumpad)
        sp = SoundPool(10, AudioManager.STREAM_MUSIC,0)
        var sound1 = sp!!.load(getApplicationContext(),R.raw.tom1,1)
        var sound2 = sp!!.load(getApplicationContext(),R.raw.snare,1)
        var sound3 = sp!!.load(getApplicationContext(),R.raw.crash,1)
        var sound4 = sp!!.load(getApplicationContext(),R.raw.sound4,1)
        var sound5 = sp!!.load(getApplicationContext(),R.raw.tom3,1)
        var sound6 = sp!!.load(getApplicationContext(),R.raw.tom4,1)
        var sound7 = sp!!.load(getApplicationContext(),R.raw.sound6,1)
        var sound8 = sp!!.load(getApplicationContext(),R.raw.kickbass,1)
        var sound9 = sp!!.load(getApplicationContext(),R.raw.tom2,1)

        playsound1.findViewById<Button>(R.id.playsound1).setOnClickListener {
            sp!!.play(sound1,1.0f,1.0f,0,0,1f);
        }
        playsound2.findViewById<Button>(R.id.playsound2).setOnClickListener {
            sp!!.play(sound2,1.0f,1.0f,0,0,1f);
        }
        playsound3.findViewById<Button>(R.id.playsound3).setOnClickListener {
            sp!!.play(sound3,1.0f,1.0f,0,0,1f);
        }
        playsound4.findViewById<Button>(R.id.playsound4).setOnClickListener {
            sp!!.play(sound4,1.0f,1.0f,0,0,1f);
        }
        playsound5.findViewById<Button>(R.id.playsound5).setOnClickListener {
            sp!!.play(sound5,1.0f,1.0f,0,0,1f);
        }
        playsound6.findViewById<Button>(R.id.playsound6).setOnClickListener {
            sp!!.play(sound6,1.0f,1.0f,0,0,1f);
        }
        playsound7.findViewById<Button>(R.id.playsound7).setOnClickListener {
            sp!!.play(sound7,1.0f,1.0f,0,0,1f);
        }
        playsound8.findViewById<Button>(R.id.playsound8).setOnClickListener {
            sp!!.play(sound8,1.0f,1.0f,0,0,1f);
        }
        playsound9.findViewById<Button>(R.id.playsound9).setOnClickListener {
            sp!!.play(sound9,1.0f,1.0f,0,0,1f);
        }
    }
}