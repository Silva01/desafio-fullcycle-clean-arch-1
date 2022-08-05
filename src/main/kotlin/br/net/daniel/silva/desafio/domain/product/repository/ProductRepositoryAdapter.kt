package br.net.daniel.silva.desafio.domain.product.repository

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO

interface ProductRepositoryAdapter {
    fun create(productInputDTO: ProductInputDTO)
    fun find(id: Int): ProductOutputDTO
    fun update(productInputDTO: ProductInputDTO)
    fun list(): MutableList<ProductOutputDTO>
}