package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductDTO

class UpdateProductUseCase(private val repository: ProductRepositoryAdapter) {
    fun update(product: ProductDTO) = repository.update(product)
}