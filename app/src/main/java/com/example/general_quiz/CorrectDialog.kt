package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class CorrectDialog: DialogFragment(R.layout.dialog_correct) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val continueBtn: Button =view.findViewById(R.id.Continue)
       // val activity = requireActivity() as NewActivity
        continueBtn.setOnClickListener{
            (activity as NewActivity).numCorrectAnswers=(activity as NewActivity).numCorrectAnswers+1
            dismiss()
        }

    }

}