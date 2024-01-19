package com.example.garageden.drawerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.garageden.R
import com.example.garageden.databinding.FragmentJobsBinding

class JobsFragment : Fragment() {

    private lateinit var binding: FragmentJobsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
       binding = FragmentJobsBinding.inflate(layoutInflater, container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}