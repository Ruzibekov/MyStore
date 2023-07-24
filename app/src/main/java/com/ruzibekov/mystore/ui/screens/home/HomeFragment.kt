package com.ruzibekov.mystore.ui.screens.home

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ruzibekov.mystore.R
import com.ruzibekov.mystore.ui.screens.home.adapter.HomeCategoryListAdapter
import com.ruzibekov.mystore.ui.screens.home.adapter.HomeProductListAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var rvCategory: RecyclerView? = null
    private val categoryListAdapter = HomeCategoryListAdapter()
    private var rvProduct: RecyclerView? = null
    private val productListAdapter = HomeProductListAdapter()
    private var ivFavorites: ImageView? = null

    private var navController: NavController? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = view.findNavController()

        view.initViews()

        initListeners()
    }

    private fun View.initViews() {

        rvCategory = findViewById<RecyclerView?>(R.id.rv_category_list).apply {
            adapter = categoryListAdapter
        }

        rvProduct = findViewById<RecyclerView?>(R.id.rv_product_list).apply {
            adapter = productListAdapter
        }

        ivFavorites = findViewById(R.id.iv_favorites)
    }

    private fun initListeners() {

        productListAdapter.onItemClick = { id ->
            navController?.navigate(R.id.action_home_fragment_to_details_fragment)
        }

        ivFavorites?.setOnClickListener {
            navController?.navigate(R.id.action_home_fragment_to_favorites_fragment)
        }
    }

}