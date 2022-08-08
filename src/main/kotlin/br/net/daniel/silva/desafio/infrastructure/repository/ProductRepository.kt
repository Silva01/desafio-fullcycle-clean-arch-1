package br.net.daniel.silva.desafio.infrastructure.repository

import br.net.daniel.silva.desafio.infrastructure.model.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<ProductEntity, Int> {
}