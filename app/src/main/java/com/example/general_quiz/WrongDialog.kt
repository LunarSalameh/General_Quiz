package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class WrongDialog:DialogFragment(R.layout.dialog_wrong) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val tryAgainBtn: Button =view.findViewById(R.id.TryAgain)
        tryAgainBtn.setOnClickListener{
            dismiss()
        }

    }
}