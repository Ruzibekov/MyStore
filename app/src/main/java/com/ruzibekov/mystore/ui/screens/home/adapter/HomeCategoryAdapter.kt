package com.ruzibekov.mystore.ui.screens.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ruzibekov.mystore.R
import com.ruzibekov.mystore.data.model.CategoryResponse

class HomeCategoryAdapter : RecyclerView.Adapter<HomeCategoryAdapter.ViewHolder>() {

    private val list: MutableList<CategoryResponse> = mutableListOf()

    fun addList(items: List<CategoryResponse>){
        this.list.addAll(items)
        notifyItemRangeInserted(list.size, items.size)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_category, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bind(list[position])
    }

    override fun getItemCount(): Int = 10 //list.size()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: CategoryResponse) {
            //todo
        }
    }
}