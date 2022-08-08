package br.net.daniel.silva.desafio.infrastructure.service

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO
import br.net.daniel.silva.desafio.infrastructure.model.ProductEntity
import br.net.daniel.silva.desafio.infrastructure.repository.ProductRepository
import br.net.daniel.silva.desafio.infrastructure.utils.convertEntityToOutput
import br.net.daniel.silva.desafio.infrastructure.utils.convertInputToEntity
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class ProductService(private val repository: ProductRepository): ProductRepositoryAdapter {
    override fun create(productInputDTO: ProductInputDTO) {
        repository.save(convertInputToEntity(productInputDTO))
    }

    override fun find(id: Int): ProductOutputDTO = convertEntityToOutput(repository.findById(id).orElse(ProductEntity()))

    override fun update(productInputDTO: ProductInputDTO) {
        create(productInputDTO)
    }

    override fun list(): MutableList<ProductOutputDTO> = repository.findAll().stream().map { d -> convertEntityToOutput(d) }.collect(Collectors.toList())
}