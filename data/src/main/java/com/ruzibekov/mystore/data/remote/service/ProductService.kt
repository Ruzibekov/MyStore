package com.ruzibekov.mystore.data.remote.service

import com.ruzibekov.mystore.data.model.product.Product
import com.ruzibekov.mystore.data.model.product.ProductsBaseResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductService {

    @GET("products")
    fun getAllProducts(): Response<ProductsBaseResponse>

    @GET("products/{id}")
    fun getSingleProduct(@Path("id") id: Int): Response<Product>
}