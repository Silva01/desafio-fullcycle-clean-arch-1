package br.net.daniel.silva.desafio.infrastructure.utils

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO
import br.net.daniel.silva.desafio.infrastructure.dto.ProductDTO
import br.net.daniel.silva.desafio.infrastructure.model.ProductEntity

fun convertInputToEntity(product: ProductInputDTO): ProductEntity =
    ProductEntity(
        product.id,
        product.name,
        product.description,
        product.status,
        product.createDate,
        product.modifyDate,
        product.price
    )

fun convertEntityToOutput(productEntity: ProductEntity): ProductOutputDTO = ProductDTO(
    productEntity.id,
    productEntity.name,
    productEntity.description,
    productEntity.status,
    productEntity.createDate,
    productEntity.modifyDate,
    productEntity.price
)