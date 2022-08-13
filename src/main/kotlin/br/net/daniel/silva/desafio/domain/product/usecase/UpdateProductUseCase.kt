package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import java.time.LocalDateTime

internal class UpdateProductUseCase(private val repository: ProductRepositoryAdapter) {
    fun update(product: ProductInputDTO) {
        product.modifyDate = LocalDateTime.now()
        repository.update(product)
    }
}