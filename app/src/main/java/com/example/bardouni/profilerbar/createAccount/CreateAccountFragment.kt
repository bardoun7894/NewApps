package com.example.bardouni.profilerbar.createAccount


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.bardouni.profilerbar.R


/**
 * A simple [Fragment] subclass.
 */
 class CreateAccountFragment :Fragment() {


public override fun onCreateView(inflater:LayoutInflater?, container:ViewGroup?,
savedInstanceState:Bundle?):View? {
 // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_create_account, container, false)
}

}// Required empty public constructor
