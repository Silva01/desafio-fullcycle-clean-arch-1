package br.net.daniel.silva.desafio.domain.product.factory

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.usecase.CreateProductUserCase
import br.net.daniel.silva.desafio.domain.product.usecase.FindProductUseCase
import br.net.daniel.silva.desafio.domain.product.usecase.ListProductUseCase
import br.net.daniel.silva.desafio.domain.product.usecase.UpdateProductUseCase
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO

class ProductFactory(private val repository: ProductRepositoryAdapter) {

    private var createProductUserCase: CreateProductUserCase = CreateProductUserCase(repository)
    private var updateProductUseCase: UpdateProductUseCase = UpdateProductUseCase(repository)
    private var findProductUseCase: FindProductUseCase = FindProductUseCase(repository)
    private var listProductUseCase: ListProductUseCase = ListProductUseCase(repository)

    fun createProductFactory(product: ProductInputDTO) {
        createProductUserCase.create(product)
    }

    fun updateProductFactory(product: ProductInputDTO) {
        updateProductUseCase.update(product)
    }

    fun findProductUseCase(id: Int): ProductOutputDTO {
        return findProductUseCase.find(id)
    }

    fun listProductUseCase(): MutableList<ProductOutputDTO> {
        return listProductUseCase.list()
    }
}