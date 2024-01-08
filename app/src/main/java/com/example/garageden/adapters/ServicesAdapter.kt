package com.example.garageden.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.garageden.data.ServicesItem
import com.example.garageden.databinding.ServiceLayoutBinding

class ServicesAdapter : RecyclerView.Adapter<ServicesAdapter.ServicesViewHolder>(){

    private var services = mutableListOf<ServicesItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ServiceLayoutBinding.inflate(inflater, parent, false)
        return  ServicesViewHolder(binding)
    }

    override fun getItemCount(): Int = services.size

    override fun onBindViewHolder(holder: ServicesViewHolder, position: Int) {
        val serv = services[position]
        holder.bind(serv)

    }
    inner class ServicesViewHolder(val binding : ServiceLayoutBinding) : RecyclerView.ViewHolder(binding.root)  {
        fun bind(serv: ServicesItem) {
            TODO("Not yet implemented")
        }

    }



}