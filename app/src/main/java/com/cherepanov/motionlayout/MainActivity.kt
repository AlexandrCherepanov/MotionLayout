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
        btn_tower.setOnClickListener { startActivity(Intent(this, TowerActivity::class.java)) }

        btn_exam1.setOnClickListener { startActivity(Intent(this, MotionPagerActivity::class.java)) }
        btn_exam2.setOnClickListener { startActivity(Intent(this, CollapseToolbarActivity::class.java)) }
        btn_exam3.setOnClickListener { startActivity(Intent(this, CollapseToolbarActivityText::class.java)) }
        btn_exam4.setOnClickListener { startActivity(Intent(this, VanGoghActivity::class.java)) }
        btn_exam5.setOnClickListener { startActivity(Intent(this, MiActivity::class.java)) }
        btn_exam6.setOnClickListener { startActivity(Intent(this, YouTubeActivity::class.java))}
    }
}