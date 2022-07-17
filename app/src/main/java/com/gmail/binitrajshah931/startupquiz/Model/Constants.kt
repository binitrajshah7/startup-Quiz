package com.gmail.binitrajshah931.startupquiz.Model

import com.gmail.binitrajshah931.startupquiz.R

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
            "Can you guess this famous Indian Startup?",
            R.drawable.one_img,
            "Byjus",
            "UpGrad",
            "Unacademy",
            "Udemy",
            2)

        val que2 = Question(1,
            "Can you guess this famous Indian Startup?",
            R.drawable.two_img,
            "Small Basket",
            "Big Basket",
            "Both a & b",
            "None of the above",
            2)

        val que3 = Question(1,
            "Can you guess this famous Indian Startup?",
            R.drawable.three_img,
            "mamaCare",
            "momEarth",
            "FamEarth",
            "mamaEarth",
            4)

        val que4 = Question(1,
            "Can you guess this famous Indian Startup?",
            R.drawable.four_img,
            "McDonalds",
            "pepperfry",
            "Aalu fry",
            "None of the above",
            2)

        val que5 = Question(1,
            "Can you guess this famous Indian Startup?",
            R.drawable.five_img,
            "save Money",
            "famPay",
            "PayRup",
            "Razorpay",
            4)

        val que6 = Question(1,
            "Can you guess this famous Indian Startup?",
            R.drawable.six_img,
            "coinCart",
            "switchCart",
            "flipKart",
            "goKart",
            3)

        val que7 = Question(1,
            "Can you guess this famous Indian Startup?",
            R.drawable.seven_img,
            "Zomato",
            "zooTomato",
            "zooTom",
            "Tamatar",
            1)

        val que8 = Question(1,
            "Who is the founder of CRED?",
            R.drawable.eight_img,
            "Sachin Bansal",
            "Jitendra Gupta",
            "Vijay Shekhar Sharma",
            "Kunal Shah",
            4)

        val que9 = Question(1,
            "What valuation makes a Unicorn?",
            R.drawable.nine_img,
            "$10 billion",
            "$1 million",
            "$1 billion",
            "$100 billion",
            3)

        val que10 = Question(1,
            "Flipkart was acquired by Walmart for ____ ?",
            R.drawable.ten_img,
            "$24 billion",
            "$1 billion",
            "$16 billion",
            "$4 billion",
            3)

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)

        return questionList
    }
}
