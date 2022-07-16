package com.gmail.binitrajshah931.startupquiz.Model

import com.gmail.binitrajshah931.startupquiz.R

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
            "Question",
            R.drawable.app_ic,
            "facebook",
            "instagram",
            "snapchat",
            "linkedin",
            2)

        val que2 = Question(1,
            "Question",
            R.drawable.app_ic,
            "facebook",
            "instagram",
            "snapchat",
            "linkedin",
            2)

        val que3 = Question(1,
            "Question",
            R.drawable.app_ic,
            "facebook",
            "instagram",
            "snapchat",
            "linkedin",
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
