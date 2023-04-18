package com.example.general_quiz

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val hBtn:Button=findViewById(R.id.homeF)
        val qBtn:Button=findViewById(R.id.Quit)
        val displayName: TextView =findViewById(R.id.urName)

        val displayScore: TextView =findViewById(R.id.FinalScore)

        val receiveName=intent.getStringExtra("sendName")
        displayName.text=receiveName

        val numCorrectAnswers = intent.getIntExtra("numCorrectAnswers",0)
        displayScore.text= numCorrectAnswers.toString()

        hBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        qBtn.setOnClickListener{
            finishAffinity()
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
                startActivity(intent)
                Toast.makeText(this, "Show Score", Toast.LENGTH_LONG).show()
            }

        }

        return true
    }
}


