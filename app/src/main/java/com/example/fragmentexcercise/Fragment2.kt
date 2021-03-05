package com.example.fragmentexcercise

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment_Lifecycle", "onCreatedView of Fragment 2")
        return inflater.inflate(R.layout.f_frag2, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment_Lifecycle", "onAttach of Fragment 2")
    }
}