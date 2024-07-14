package com.dicoding.textrecognitionandtranslation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.textrecognitionandtranslation.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val splashScreenTextLogo =
            ObjectAnimator.ofFloat(binding.textView, View.ALPHA, 1f).setDuration(2000)

        AnimatorSet().apply {
            play(splashScreenTextLogo)
            start()
        }

        val intent = Intent(this, MainActivity::class.java)

        binding.logo.animate()
            .setDuration(3000)
            .alpha(1f)
            .withEndAction {
                startActivity(intent)
                finish()
            }
    }
}
