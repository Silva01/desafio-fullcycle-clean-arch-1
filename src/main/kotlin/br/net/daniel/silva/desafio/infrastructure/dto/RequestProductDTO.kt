package br.net.daniel.silva.desafio.infrastructure.dto

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import java.math.BigDecimal
import java.time.LocalDateTime

class RequestProductDTO(
    override val id: Int?,
    override val name: String?,
    override val description: String?,
    override val status: String?,
    override val createDate: LocalDateTime?,
    override val modifyDate: LocalDateTime?,
    override val price: BigDecimal?
) : ProductInputDTO