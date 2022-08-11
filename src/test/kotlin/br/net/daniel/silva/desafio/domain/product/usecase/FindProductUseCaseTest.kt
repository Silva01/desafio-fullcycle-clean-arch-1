package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.utils.generateProductMock
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.junit.jupiter.api.Assertions.*
import java.math.BigDecimal
import java.util.*

@Tag("unitTest")
class FindProductUseCaseTest {

    private val repository = mock(ProductRepositoryAdapter::class.java)

    @Test
    fun deveMeRetornarUmRegistro() {
        `when`(repository.find(anyInt())).thenReturn(generateProductMock())
        val product = repository.find(1)

        assertEquals(1, product.id)
        assertEquals("mac", product.name)
        assertEquals("produto de teste 1", product.description)
        assertEquals("VENDIDO", product.status)
        assertTrue(BigDecimal("100").equals(product.price))
    }
}