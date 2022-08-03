package br.net.daniel.silva.desafio.domain.product.valueobject

import java.math.BigDecimal
import java.time.LocalDateTime

interface ProductDTO {
    val id: Int
    val name: String
    val description: String
    val status: String
    val createDate: LocalDateTime
    val modifyDate: LocalDateTime
    val price: BigDecimal
}