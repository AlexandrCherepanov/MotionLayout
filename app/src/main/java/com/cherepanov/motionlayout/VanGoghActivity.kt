package com.cherepanov.motionlayout

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.BounceInterpolator
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.custom_share_layout.*

class VanGoghActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_van_gogh_start)
    }


//    fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
//
//    }
//
//   fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
//
//    }
//
//    fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
//
//    }
//
//    fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
//        if(p1 == R.layout.activity_van_gogh_end && p0?.currentState != -1) {
//            doBounceAnimation(seenImage)
//            doBounceAnimation(favImage)
//            doBounceAnimation(shareImage)
//        }
//
//    }
//
//    private fun doBounceAnimation(targetView: View) {
//        val animator = ObjectAnimator.ofFloat(targetView, "translationY", 0f, -10f, 0f)
//        animator.interpolator = BounceInterpolator()
//        animator.duration = 500
//        animator.start()
//    }
}