package com.gmail.binitrajshah931.startupquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import com.gmail.binitrajshah931.startupquiz.Model.Constants
import com.gmail.binitrajshah931.startupquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            if (TextUtils.isEmpty(binding.etName.text.toString())) {
                Log.d("check", "status: null string")
                Toast.makeText(this, "Please Enter your name!", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, binding.etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}