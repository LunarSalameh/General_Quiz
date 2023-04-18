package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.fragment.app.Fragment
class FourthFragment: Fragment(R.layout.fragment_fourth) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val  correct:RadioButton=view.findViewById(R.id.correctQ4)
        val  wrong5:RadioButton=view.findViewById(R.id.wrongQ4_5)
        val  wrong6:RadioButton=view.findViewById(R.id.wrongQ4_6)
        val  wrong9:RadioButton=view.findViewById(R.id.wrongQ4_9)


        correct.setOnClickListener{
            val dialogVar = CorrectDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong5.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong6.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong9.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

    }
}