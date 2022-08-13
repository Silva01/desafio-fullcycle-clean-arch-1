package br.net.daniel.silva.desafio.domain.product.valueobject

import java.math.BigDecimal
import java.time.LocalDateTime

interface ProductInputDTO {
    var id: Int?
    var name: String?
    var description: String?
    var status: String?
    var createDate: LocalDateTime?
    var modifyDate: LocalDateTime?
    var price: BigDecimal?
}

interface ProductOutputDTO {
    val id: Int?
    val name: String?
    val description: String?
    val status: String?
    val price: BigDecimal?
}