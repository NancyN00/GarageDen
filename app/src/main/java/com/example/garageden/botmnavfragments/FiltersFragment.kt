package com.example.garageden.botmnavfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.garageden.R
import com.example.garageden.databinding.FragmentFillersBinding

class FiltersFragment : Fragment() {

    private lateinit var binding: FragmentFillersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFillersBinding.inflate(inflater, container, false)
        return (binding.root)
    }

}