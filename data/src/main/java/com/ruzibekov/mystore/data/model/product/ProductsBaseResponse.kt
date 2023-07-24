package com.ruzibekov.mystore.data.model.product

data class ProductsBaseResponse(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)