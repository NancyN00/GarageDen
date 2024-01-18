package com.example.garageden.botmnavfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.garageden.R
import com.example.garageden.adapters.BrowseAdapter
import com.example.garageden.data.BrowseItem
import com.example.garageden.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var browseAdapter: BrowseAdapter = BrowseAdapter()
    private var browseList = mutableListOf<BrowseItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
       binding = FragmentHomeBinding.inflate(inflater, container, false)
        return(binding.root)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        browseItems()
        prepareRecyclerView()
        updateBrowseItems(browseList)

    }

    private fun prepareRecyclerView() {
        binding.browserv.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        binding.browserv.setHasFixedSize(true)
        binding.browserv.adapter = browseAdapter
    }

    private fun browseItems() {
       browseList.add(
           BrowseItem(R.drawable.baseline_star_24,
           "Brand",
           "Sell all car by brand."))

        browseList.add(BrowseItem(R.drawable.baseline_monetization,
            "Budget",
            "Budget is flexible."))

        browseList.add(BrowseItem(R.drawable.baseline_car_repair,
            "Body Type",
            "View by body type."))

        browseList.add(BrowseItem(R.drawable.baseline_fuel,
            "Fuel",
            "Check by fuel type."))

    }

    private fun updateBrowseItems(brow : List<BrowseItem>) {
       browseAdapter.setBrowseItems(brow)
    }

}