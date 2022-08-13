package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO

internal class FindProductUseCase(private val repository: ProductRepositoryAdapter) {
    fun find(id: Int): ProductOutputDTO = repository.find(id)
}