package com.example.garageden.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.garageden.data.BrowseItem
import com.example.garageden.databinding.BrowseLayoutBinding

class BrowseAdapter : RecyclerView.Adapter<BrowseAdapter.BrowseViewHolder>() {

       private var browse = mutableListOf<BrowseItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrowseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BrowseLayoutBinding.inflate(inflater, parent, false)
        return  BrowseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BrowseViewHolder, position: Int) {
        val browses = browse[position]
        holder.bind(browses)
    }

    override fun getItemCount(): Int = browse.size
    inner class BrowseViewHolder(val binding: BrowseLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(serv: BrowseItem) {
            TODO("Not yet implemented")
        }
    }
}




