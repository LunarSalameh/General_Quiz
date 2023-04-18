package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.fragment.app.Fragment
class ThirdFragment: Fragment(R.layout.fragment_third) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val  correct:RadioButton=view.findViewById(R.id.correctQ3)
        val  wrong23:RadioButton=view.findViewById(R.id.wrongQ3_23)
        val  wrong25:RadioButton=view.findViewById(R.id.wrongQ3_25)
        val  wrong26:RadioButton=view.findViewById(R.id.wrongQ3_26)


        correct.setOnClickListener{
            val dialogVar = CorrectDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")


        }

        wrong23.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong25.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong26.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

    }
}