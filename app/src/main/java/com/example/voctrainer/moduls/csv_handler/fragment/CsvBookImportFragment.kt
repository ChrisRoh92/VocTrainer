package com.example.voctrainer.moduls.csv_handler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.voctrainer.R


class CsvBookImportFragment : Fragment() {

    // Allgemeine Sachen:
    private lateinit var rootView:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_csv_book_import, container, false)



        return rootView
    }

}
