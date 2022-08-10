package br.net.daniel.silva.desafio.utils

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO
import java.math.BigDecimal
import java.time.LocalDateTime

class ProductDTOTest(
    override val id: Int?,
    override val name: String?,
    override val description: String?,
    override val status: String?,
    override val createDate: LocalDateTime?,
    override val modifyDate: LocalDateTime?,
    override val price: BigDecimal?
) : ProductOutputDTO