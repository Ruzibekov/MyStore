package com.ruzibekov.mystore.ui.screens.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.ruzibekov.mystore.R
import com.ruzibekov.mystore.data.model.product.Product

class HomeProductListAdapter : RecyclerView.Adapter<HomeProductListAdapter.ViewHolder>() {

    private val list: MutableList<Product> = mutableListOf()

    var onItemClick: ((id: Int) -> Unit)? = null

    fun addList(items: List<Product>) {
        this.list.addAll(items)
        notifyItemRangeInserted(list.size, items.size)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_product, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind{
            onItemClick?.invoke(0)
        }
//        holder.bind(list[position])
    }

    override fun getItemCount(): Int = 10 //list.size()

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        private var ivProduct: ImageView? = null

        init {
            ivProduct = view.findViewById(R.id.iv_product)
        }

        fun bind(onItemClick: (ImageView) -> Unit) {
            view.setOnClickListener { onItemClick(ivProduct!!) }
            //todo
        }
    }
}