package com.example.historyapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring all the factors in my app

        val etAge = findViewById<EditText>(R.id.etAge).text

        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnHistory = findViewById<Button>(R.id.btnHistory)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        //defining the operation of the clear button

        btnClear.setOnClickListener {
            etAge.clear()
        }

        //defining the function of the History button

        btnHistory.setOnClickListener {

            if (etAge.toString().toInt() == 50) {
                tvResult.text = "You are the same age as Michael Jackson who died at the age of 50 in 2009 and was famously known as the 'King of Pop' & for doing the best moonwalk."
            } else if (etAge.toString().toInt() == 42) {
                tvResult.text = "You are the same age as Elvis Presley who died at the age of 42 in 1977. He was famously known for being a musical icon who was name the 'King of Rock and Roll'"
            } else if (etAge.toString().toInt() == 36) {
                tvResult.text = "You are the same age as Marylin Monroe who died at the age of 36 in 1962. She was known for being an iconic actress and model."
            } else if (etAge.toString().toInt() == 76) {
                tvResult.text = "You are the same age as Albert Einstein who died at the age of 76 in 1955. He was a very well known physicist and philosopher with an IQ between 160-190"
            } else if (etAge.toString().toInt() == 36) {
                tvResult.text = "You are the same age as Princess Diana who died at the age of 36 in 1997. She died in a fatal car crash and was a member of the British Royal Family."
            } else if (etAge.toString().toInt() == 37) {
                tvResult.text = "You are the same age as Vincent van Gogh who died at the age of 37 in 1890. He was the famous painter that painted 'The Starry Night' painting"
            } else if (etAge.toString().toInt() == 40) {
                tvResult.text = "You are the same age as Amelia Earhart who died at the age of 40 in 1937. She was a pioneer in American aviation and was the first female to fly solo across the atlantic ocean."
            } else if (etAge.toString().toInt() == 39) {
                tvResult.text = "You are the same age as Martin Luther King Jr. (also known as MLK) who died at the age of 39 in 1968. He was a civil rights activist who played a crucial role in the American Civil Rights Movement."
            } else if (etAge.toString().toInt() == 86) {
                tvResult.text = "You are the same age as Maya Angelo who died at the age of 86 in 2014. She was an american poet and civil rights activist."
            } else if (etAge.toString().toInt() == 47) {
                tvResult.text = "You are the same age as Frida Kahlo who died at the age of 47 in 1954. She was a well known mexican painter who depicted Mexican culture in her portraits."
            } else if (etAge.toString().toInt() == 56) {
                tvResult.text = "You are the same age as Abraham Lincoln who died at the age of 56 in 1865. He was the 16th president of the United States and was known for leading america during the American Civil Rights War."
            } else if (etAge.toString().toInt() == 66) {
                tvResult.text = "You are the same age as Marie Curie who died at the age of 66 in 1934. She was a Polish physicist and chemist who was the first woman and first person to win two Nobel Peace Prizes"
            } else if (etAge.toString().toInt() == 74) {
                tvResult.text = "You are the same age as Muhammad Ali who died at the age of 74 in 2014. He is known as the worlds greatest boxer to ever live, but that title is compared to the performances of Mike Tyson & Floyd Mayweather."
            } else if (etAge.toString().toInt() == 41) {
                tvResult.text = "You are the same age as Jane Austen who died at the age of 41 in 1817. Jane was known for being a popular english novelist."
            } else if (etAge.toString().toInt() == 56) {
                tvResult.text = "You are the same age as Steve Jobs who died at the age of 56 in 2011. He was the visionary who created the iphone, ipad, & ipod. He revolutionized smartphone technology."
            //creating a range of what ages can be entered and writing the error message to be displayed for ages entered outside that range
            } else if (etAge.toString().toInt() < 20) {
                tvResult.text = "You entered an age below the age of 20. Please enter an age between 20 and 100."
            } else if (etAge.toString().toInt() > 100) {
                tvResult.text = "You entered an age above the age of 100. Please enter an age between 20 and 100."
            //creating an error message to display when the user enters an age that does not match with anybody listed in the system
            } else {
                tvResult.text = "We do not have anyone of that age recorded in our system."
            }
        }
    }
}