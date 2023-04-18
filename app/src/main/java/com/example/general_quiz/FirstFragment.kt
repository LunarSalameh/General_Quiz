package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.fragment.app.Fragment
class FirstFragment: Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val  correct:RadioButton=view.findViewById(R.id.correctQ1)
        val  wrong24:RadioButton=view.findViewById(R.id.wrongQ1_24)
        val  wrong25:RadioButton=view.findViewById(R.id.wrongQ1_25)
        val  wrong27:RadioButton=view.findViewById(R.id.wrongQ1_27)


        correct.setOnClickListener{
            val dialogVar = CorrectDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")


        }

        wrong24.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong25.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong27.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

    }
}