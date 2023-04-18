package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.fragment.app.Fragment
class FifthFragment: Fragment(R.layout.fragment_fifth) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val  correct:RadioButton=view.findViewById(R.id.correctQ5)
        val  wrongBe:RadioButton=view.findViewById(R.id.wrongQ5_Be)
        val  wrongLi:RadioButton=view.findViewById(R.id.wrongQ5_li)
        val  wrongSh:RadioButton=view.findViewById(R.id.wrongQ5_sh)


        correct.setOnClickListener{
            val dialogVar = CorrectDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrongBe.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrongLi.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrongSh.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

    }
}