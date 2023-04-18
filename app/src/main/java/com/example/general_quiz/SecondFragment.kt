package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.fragment.app.Fragment
class SecondFragment: Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        val  correct: RadioButton =view.findViewById(R.id.correct2)
        val  wrong5: RadioButton =view.findViewById(R.id.wrong5)
        val  wrong9: RadioButton =view.findViewById(R.id.wrong9)
        val  wrong8: RadioButton =view.findViewById(R.id.wrong8)


        correct.setOnClickListener{
            val dialogVar = CorrectDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")


        }

        wrong5.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong9.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }

        wrong8.setOnClickListener{
            val dialogVar = WrongDialog()
            dialogVar.show(childFragmentManager, "Custom Dialog")

        }



    }
}