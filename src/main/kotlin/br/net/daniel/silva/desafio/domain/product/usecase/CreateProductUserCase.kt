package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import java.time.LocalDateTime

internal class CreateProductUserCase(private val repository: ProductRepositoryAdapter) {
    fun create(product: ProductInputDTO) {
        product.createDate = LocalDateTime.now()
        repository.create(product)
    }
}