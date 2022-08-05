package br.net.daniel.silva.desafio.domain.product.valueobject

import java.math.BigDecimal
import java.time.LocalDateTime

interface ProductInputDTO {
    val id: Int
    val name: String
    val description: String
    val status: String
    val createDate: LocalDateTime
    val modifyDate: LocalDateTime
    val price: BigDecimal
}

interface ProductOutputDTO {
    val id: Int
    val name: String
    val description: String
    val status: String
    val createDate: LocalDateTime
    val modifyDate: LocalDateTime
    val price: BigDecimal
}