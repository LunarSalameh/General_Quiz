package com.example.general_quiz

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    var numCorrectAnswers =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val firstFragment=FirstFragment()
        val secondFragment=SecondFragment()
        val thirdFragment=ThirdFragment()

        val fourthFragment=FourthFragment()
        val fifthFragment=FifthFragment()
        val sixthFragment=SixthFragment()

        val q1Button:Button =findViewById(R.id.Q1)
        val q2Button:Button =findViewById(R.id.Q2)
        val q3Button:Button =findViewById(R.id.Q3)

        val q4Button:Button =findViewById(R.id.Q4)
        val q5Button:Button =findViewById(R.id.Q5)
        val q6Button:Button =findViewById(R.id.Q6)
        val finishButton:Button = findViewById(R.id.DnBtn)

        val receiveName=intent.getStringExtra("sendName")


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.Frag, firstFragment)
            commit()
        }

        q1Button.setOnClickListener {
            q1Button.setBackgroundColor(Color.BLUE)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frag, firstFragment)
                commit()
            }
        }


        q2Button.setOnClickListener {
            q2Button.setBackgroundColor(Color.BLUE)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frag, secondFragment)
                commit()
            }
        }

        q3Button.setOnClickListener {
            q3Button.setBackgroundColor(Color.BLUE)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frag, thirdFragment)
                commit()
            }
        }

        q4Button.setOnClickListener {
            q4Button.setBackgroundColor(Color.BLUE)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frag, fourthFragment)
                commit()
            }
        }


        q5Button.setOnClickListener {
            q5Button.setBackgroundColor(Color.BLUE)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frag, fifthFragment)
                commit()
            }
        }

        q6Button.setOnClickListener {
            q6Button.setBackgroundColor(Color.BLUE)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frag, sixthFragment)
                commit()
            }
        }


        finishButton.setOnClickListener{
            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra("numCorrectAnswer", numCorrectAnswers)
            intent.putExtra("sendName", receiveName)
            startActivity(intent)
            Toast.makeText(this, "Quiz Finished", Toast.LENGTH_LONG).show()

        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.ReAttempt -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Restart", Toast.LENGTH_LONG).show()
            }
            R.id.Rate -> {
                Toast.makeText(this, "App Rating", Toast.LENGTH_LONG).show()
                    val dialogVar = RateDialog()
                    dialogVar.show(supportFragmentManager, "Custom Dialog")
            }
            R.id.Show_Score -> {
                val intent = Intent(this, FinishActivity::class.java)
                intent.putExtra("numCorrectAnswer", numCorrectAnswers)
                startActivity(intent)
                Toast.makeText(this, "Show Score", Toast.LENGTH_LONG).show()

            }

        }

        return true
    }

}