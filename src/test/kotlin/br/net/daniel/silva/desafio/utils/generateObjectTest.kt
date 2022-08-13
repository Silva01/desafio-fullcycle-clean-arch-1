package br.net.daniel.silva.desafio.utils

import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO
import java.math.BigDecimal
import java.time.LocalDateTime

fun generateListProductMock(): MutableList<ProductOutputDTO> = mutableListOf(generateProductMock())

fun generateProductMock(): ProductOutputDTO = ProductDTOTest(1, "mac", "produto de teste 1", "VENDIDO", BigDecimal("100"))
fun generateProducUpdatetMock(updateName: String): ProductOutputDTO = ProductDTOTest(1, updateName, "produto de teste 1", "VENDIDO", BigDecimal("100"))