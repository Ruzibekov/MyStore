package com.ruzibekov.mystore.ui.screens.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.ruzibekov.mystore.R
import com.ruzibekov.mystore.ui.screens.home.adapter.HomeCategoryAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var rvCategory: RecyclerView? = null
    private val categoryAdapter = HomeCategoryAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.initViews()
    }



    private fun View.initViews() {
        rvCategory = this.findViewById(R.id.rv_category)
        rvCategory?.adapter = categoryAdapter
    }

}