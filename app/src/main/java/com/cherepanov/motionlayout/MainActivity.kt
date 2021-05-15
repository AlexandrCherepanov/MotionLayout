package com.cherepanov.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_clouds.setOnClickListener { startActivity(Intent(this, CloudsActivity::class.java)) }
        btn_gates.setOnClickListener { startActivity(Intent(this, GatesActivity::class.java)) }
    }
}