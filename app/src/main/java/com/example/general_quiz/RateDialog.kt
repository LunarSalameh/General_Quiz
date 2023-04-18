package com.example.general_quiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class RateDialog:DialogFragment(R.layout.dialog_rate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val doneRate: Button =view.findViewById(R.id.dnRate)
        doneRate.setOnClickListener{
            dismiss()
        }
    }

}