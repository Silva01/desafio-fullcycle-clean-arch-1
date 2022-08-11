package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.utils.ProductInputDTOTest
import br.net.daniel.silva.desafio.utils.generateProductMock
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.math.BigDecimal
import java.time.LocalDateTime

@Tag("unitTest")
class CreateProductUserCaseTest {

    private val repository = mock(ProductRepositoryAdapter::class.java)

    @Test
    fun deveCriarUmUsuario() {
        val productOutputTest = generateProductMock()
        repository.create(ProductInputDTOTest(null, "mac", "produto de teste 1", "VENDIDO", LocalDateTime.now(), null, BigDecimal("100")))

        `when`(repository.find(anyInt())).thenReturn(productOutputTest)
        val product = repository.find(1)

        assertEquals(1, product.id)
        assertEquals("mac", product.name)
        assertEquals("produto de teste 1", product.description)
        assertEquals("VENDIDO", product.status)
        assertTrue(BigDecimal("100").equals(product.price))
    }
}