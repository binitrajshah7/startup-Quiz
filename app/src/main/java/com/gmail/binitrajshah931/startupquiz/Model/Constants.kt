package com.gmail.binitrajshah931.startupquiz.Model

import com.gmail.binitrajshah931.startupquiz.R

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
            "Guess the logo?",
            R.drawable.app_ic,
            "facebook",
            "instagram",
            "snapchat",
            "linkedin",
            2)

        val que2 = Question(1,
            "Question",
            R.drawable.app_ic,
            "a",
            "b",
            "d",
            "e",
            2)

        val que3 = Question(1,
            "Question",
            R.drawable.app_ic,
            "f",
            "g",
            "h",
            "i",
            2)

        val que4 = Question(1,
            "Question",
            R.drawable.app_ic,
            "facebook",
            "instagram",
            "snapchat",
            "linkedin",
            2)

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        return questionList
    }
}
