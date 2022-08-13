package br.net.daniel.silva.desafio.domain.product.factory

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.usecase.CreateProductUserCase
import br.net.daniel.silva.desafio.domain.product.usecase.FindProductUseCase
import br.net.daniel.silva.desafio.domain.product.usecase.ListProductUseCase
import br.net.daniel.silva.desafio.domain.product.usecase.UpdateProductUserCase
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO

class ProductFactory(private val repository: ProductRepositoryAdapter) {

    fun createProductFactory(product: ProductInputDTO) {
        val createProductUserCase = CreateProductUserCase(repository)
        createProductUserCase.create(product)
    }

    fun updateProductFactory(product: ProductInputDTO) {
        val updateProductUseCase = UpdateProductUserCase(repository)
        updateProductUseCase.update(product)
    }

    fun findProductUseCase(id: Int): ProductOutputDTO {
        val findProductUseCase = FindProductUseCase(repository)
        return findProductUseCase.find(id)
    }

    fun listProductUseCase(): MutableList<ProductOutputDTO> {
        val listProductUseCase = ListProductUseCase(repository)
        return listProductUseCase.list()
    }
}