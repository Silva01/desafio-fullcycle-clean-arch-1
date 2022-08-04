package br.net.daniel.silva.desafio.domain.product.repository

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductDTO

interface ProductRepositoryAdapter {
    fun create(productDTO: ProductDTO)
    fun find(id: Int): ProductDTO
    fun update(productDTO: ProductDTO)
    fun list(): MutableList<ProductDTO>
}