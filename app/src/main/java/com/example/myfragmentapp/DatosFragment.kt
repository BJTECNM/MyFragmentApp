package com.example.myfragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myfragmentapp.databinding.FragmentDatosBinding

class DatosFragment : Fragment() {

    private lateinit var binding : FragmentDatosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_datos, container, false
        )

        binding.viewModel = CalculatorViewModel()
        binding.lifecycleOwner = this

        return binding.root
    }

}