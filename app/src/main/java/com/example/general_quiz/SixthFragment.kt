package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.fragment.app.Fragment
class SixthFragment: Fragment(R.layout.fragment_sixth) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val  correct:RadioButton=view.findViewById(R.id.correctQ6)
        val  wrongAF:RadioButton=view.findViewById(R.id.wrongQ6_AF)
        val  wrongEU:RadioButton=view.findViewById(R.id.wrongQ6_Eu)
        val  wrongSA:RadioButton=view.findViewById(R.id.wrongQ6_SA)


        correct.setOnClickListener{
            val dialogVar = CorrectDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrongEU.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrongAF.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrongSA.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

    }
}