package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO

internal class CreateProductUserCase(private val repository: ProductRepositoryAdapter) {
    fun create(product: ProductInputDTO) = repository.create(product)
}