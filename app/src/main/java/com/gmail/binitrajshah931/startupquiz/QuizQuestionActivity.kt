package com.gmail.binitrajshah931.startupquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gmail.binitrajshah931.startupquiz.Model.Constants
import com.gmail.binitrajshah931.startupquiz.Model.Question
import com.gmail.binitrajshah931.startupquiz.databinding.ActivityMainBinding
import com.gmail.binitrajshah931.startupquiz.databinding.ActivityQuizQuestionBinding

class QuizQuestionActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuizQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questionList = Constants.getQuestions()
        Log.d("check", "Status: Question size: ${questionList.size}")

        val currentPosition = 1
        val question: Question = questionList[currentPosition-1]
        binding.progressBar.progress = currentPosition
        binding.tvProgress.text = "${currentPosition}/${binding.progressBar.max}"

        binding.tvQuestion.text = question.question
        binding.ivImage.setImageResource(question.image)
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour

    }
}