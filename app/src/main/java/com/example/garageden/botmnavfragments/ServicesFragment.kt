package com.example.garageden.botmnavfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.garageden.R
import com.example.garageden.databinding.FragmentServicesBinding


class ServicesFragment : Fragment() {

    private lateinit var binding: FragmentServicesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
     binding = FragmentServicesBinding.inflate(inflater, container, false)
        return(binding.root)
    }

}