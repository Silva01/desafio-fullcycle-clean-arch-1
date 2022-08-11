package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.utils.generateListProductMock
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.springframework.boot.test.mock.mockito.MockBean
import java.math.BigDecimal


@Tag("unitTest")
class ListProductUseCaseTest {

    @MockBean
    private val repository: ProductRepositoryAdapter = mock(ProductRepositoryAdapter::class.java)

    @Test
    fun deveRetornarUmaListaComProdutos() {
        `when`(repository.list()).thenReturn(generateListProductMock())

        val products = repository.list()

        assertEquals(1, products.size)
        assertEquals(1, products[0].id)
        assertEquals("mac", products[0].name)
        assertEquals("produto de teste 1", products[0].description)
        assertEquals("VENDIDO", products[0].status)
        assertTrue(BigDecimal("100").equals(products[0].price))
    }
}