package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductDTO

class FindProductUseCase(private val repository: ProductRepositoryAdapter) {
    fun find(id: Int): ProductDTO = repository.find(id)
}