package com.example.garageden.botmnavfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.garageden.R
import com.example.garageden.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
       binding = FragmentHomeBinding.inflate(inflater, container, false)
        return(binding.root)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}