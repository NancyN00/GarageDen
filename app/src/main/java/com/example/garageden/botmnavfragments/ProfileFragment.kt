package com.example.garageden.botmnavfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.garageden.R
import com.example.garageden.databinding.FragmentHomeBinding
import com.example.garageden.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
       binding = FragmentProfileBinding.inflate(inflater, container, false)
        return(binding.root)
    }


}