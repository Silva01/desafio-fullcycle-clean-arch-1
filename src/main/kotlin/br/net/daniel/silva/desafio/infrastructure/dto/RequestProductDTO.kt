package br.net.daniel.silva.desafio.infrastructure.dto

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import java.math.BigDecimal
import java.time.LocalDateTime

class RequestProductDTO(
    override var id: Int?,
    override var name: String?,
    override var description: String?,
    override var status: String?,
    override var createDate: LocalDateTime?,
    override var modifyDate: LocalDateTime?,
    override var price: BigDecimal?
) : ProductInputDTO