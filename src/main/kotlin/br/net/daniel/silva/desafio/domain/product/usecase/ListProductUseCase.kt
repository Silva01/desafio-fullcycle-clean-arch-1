package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO

internal class ListProductUseCase(private val repository: ProductRepositoryAdapter) {
    fun list(): MutableList<ProductOutputDTO> = repository.list()
}