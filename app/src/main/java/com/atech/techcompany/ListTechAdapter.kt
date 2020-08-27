package com.atech.techcompany

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class ListTechAdapter (private val listTech: ArrayList<TechComp>):
    RecyclerView.Adapter<ListTechAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.tech_view, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTech.size
    }

    override fun onBindViewHolder(holder:ListViewHolder, position: Int) {
        val tech = listTech[position]

        Glide.with(holder.itemView.context)
            .load(tech.icons)
            .apply(RequestOptions().override(55, 55))
            .into(holder.icons)

        holder.tvName.text = tech.name
        holder.tvDetail.text = tech.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listTech[holder.adapterPosition])
        }
    }

    class ListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var icons: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: TechComp)
    }


}