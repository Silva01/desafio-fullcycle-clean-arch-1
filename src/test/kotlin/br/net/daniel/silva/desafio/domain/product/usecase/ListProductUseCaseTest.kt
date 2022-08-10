package br.net.daniel.silva.desafio.domain.product.usecase

import br.net.daniel.silva.desafio.domain.product.repository.ProductRepositoryAdapter
import br.net.daniel.silva.desafio.utils.generateListProductMock
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.springframework.boot.test.mock.mockito.MockBean


class ListProductUseCaseTest {

    @MockBean
    private val repository: ProductRepositoryAdapter = mock(ProductRepositoryAdapter::class.java)

    @Test
    fun deveRetornarUmaListaComProdutos() {
        `when`(repository.list()).thenReturn(generateListProductMock())

        val products = repository.list()

        assertEquals(1, products.size)
        assertEquals(1, products[0].id)

    }
}