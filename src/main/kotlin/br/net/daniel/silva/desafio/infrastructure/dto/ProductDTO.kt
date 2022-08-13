package br.net.daniel.silva.desafio.infrastructure.dto

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO
import java.math.BigDecimal
import java.time.LocalDateTime

class ProductDTO(
    override val id: Int?,
    override val name: String?,
    override val description: String?,
    override val status: String?,
    override val price: BigDecimal?
) : ProductOutputDTO