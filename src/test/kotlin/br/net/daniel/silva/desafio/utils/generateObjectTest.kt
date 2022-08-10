package br.net.daniel.silva.desafio.utils

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO
import java.math.BigDecimal
import java.time.LocalDateTime

fun generateListProductMock(): MutableList<ProductOutputDTO> {
    val product1 = ProductDTOTest(1, "mac", "produto de teste 1", "VENDIDO", LocalDateTime.now(), null, BigDecimal("100"))
    return mutableListOf(product1)
}