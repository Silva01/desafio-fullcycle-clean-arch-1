package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.utils.ProductInputDTOTest
import br.net.daniel.silva.desafio.utils.generateProducUpdatetMock
import br.net.daniel.silva.desafio.utils.generateProductMock
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.math.BigDecimal

@Tag("unitTest")
class UpdateProductUseCase {

    private val repository = mock(ProductRepositoryAdapter::class.java)

    @Test
    fun deveAtualizarUmRegistro() {
        val responseMock = generateProducUpdatetMock("teste")
        repository.update(ProductInputDTOTest(responseMock.id, responseMock.name, responseMock.description, responseMock.status,null,  null, responseMock.price))
        `when`(repository.find(anyInt())).thenReturn(responseMock)

        assertEquals(1, responseMock.id)
        assertEquals("teste", responseMock.name)
        assertEquals("produto de teste 1", responseMock.description)
        assertEquals("VENDIDO", responseMock.status)
        assertTrue(BigDecimal("100") == responseMock.price)
    }
}