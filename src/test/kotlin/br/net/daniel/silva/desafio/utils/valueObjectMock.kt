package br.net.daniel.silva.desafio.utils

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductInputDTO
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO
import java.math.BigDecimal
import java.time.LocalDateTime

class ProductDTOTest(
    override val id: Int?,
    override val name: String?,
    override val description: String?,
    override val status: String?,
    override val price: BigDecimal?
) : ProductOutputDTO

class ProductInputDTOTest(
    override var id: Int?,
    override var name: String?,
    override var description: String?,
    override var status: String?,
    override var createDate: LocalDateTime?,
    override var modifyDate: LocalDateTime?,
    override var price: BigDecimal?
) : ProductInputDTO