package com.example.draweractivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_and_version.view.*

class AndVersionAdapter(val items: Array<AndVersion>) :
    RecyclerView.Adapter<AndVersionAdapter.ViewHolder>() {
    override fun getItemCount(): Int = items.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val lineView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_and_version, parent, false)
        return ViewHolder(lineView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndVersion(items[position])
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindAndVersion(andVersion: AndVersion) {
            with(andVersion) {
                view.andVersionTxt.text = "$name"
            }
        }
    }
}