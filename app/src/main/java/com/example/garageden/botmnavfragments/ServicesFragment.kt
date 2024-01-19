package com.example.garageden.botmnavfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.garageden.R
import com.example.garageden.adapters.BrowseAdapter
import com.example.garageden.adapters.ServicesAdapter
import com.example.garageden.data.BrowseItem
import com.example.garageden.data.ServicesItem
import com.example.garageden.databinding.FragmentServicesBinding

class ServicesFragment : Fragment() {

    private lateinit var binding: FragmentServicesBinding
    private var serviceAdapter: ServicesAdapter = ServicesAdapter()
    private var servicesList = mutableListOf<ServicesItem>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentServicesBinding.inflate(inflater, container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        serviceItemss()
        prepareServiceRV()
        updateServiceItems(servicesList)
    }

    private fun updateServiceItems(servicesList: MutableList<ServicesItem>) {
        serviceAdapter.setServiceItems(servicesList)
    }

    private fun prepareServiceRV() {
        binding.servicesRv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        binding.servicesRv.setHasFixedSize(true)
        binding.servicesRv.adapter = serviceAdapter
    }

    private fun serviceItemss() {
        servicesList.add(ServicesItem(R.drawable.threedots,
            R.drawable.carddiag,
            "Car Diagnostic"))

        servicesList.add(ServicesItem(R.drawable.threedots,
            R.drawable.casservice,
            "Car Services"))

        servicesList.add(ServicesItem(R.drawable.threedots,
            R.drawable.enginerepair,
            "Engine Repairing"))

        servicesList.add(ServicesItem(R.drawable.threedots,
            R.drawable.tyreservice,
            "Tyre Service"))

        servicesList.add(ServicesItem(R.drawable.threedots,
            R.drawable.batterychange,
            "Battery Change"))

        servicesList.add(ServicesItem(R.drawable.threedots,
            R.drawable.carwash,
            "Car Wash"))
    }


}