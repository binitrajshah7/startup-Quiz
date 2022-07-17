package com.gmail.binitrajshah931.startupquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gmail.binitrajshah931.startupquiz.Model.Constants
import com.gmail.binitrajshah931.startupquiz.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding : ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(Constants.USER_NAME)
        val correctAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        val totalQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)

        binding.tvUsername.text = username
        "Your score is $correctAnswers out of $totalQuestions.".also { binding.tvScore.text = it }

        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}