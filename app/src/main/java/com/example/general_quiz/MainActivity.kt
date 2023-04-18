package com.example.general_quiz
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sqButton:Button=findViewById(R.id.SQ_button)
        val inName: EditText = findViewById(R.id.name)

        sqButton.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            val msg=inName.text.toString()
            intent.putExtra("sendName",msg)
            startActivity(intent)
            Toast.makeText(this, "Quiz Has Started", Toast.LENGTH_LONG).show()

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