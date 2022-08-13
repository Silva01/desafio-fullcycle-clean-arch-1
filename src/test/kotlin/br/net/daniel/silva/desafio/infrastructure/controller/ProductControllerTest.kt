package br.net.daniel.silva.desafio.infrastructure.controller

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.*
import java.net.URI

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Tag("integration")
internal class ProductControllerTest {

    var testRestTemplate = TestRestTemplate()

    @Test
    @Order(1)
    fun create() {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON

        val result = testRestTemplate.exchange(
            URI("http://localhost:8080/product/create"),
            HttpMethod.POST,
            HttpEntity("{\n" +
                    "\t\"name\": \"Mac Book Pro\",\n" +
                    "\t\"description\": \"Esse é um produto\",\n" +
                    "\t\"status\": \"EM_ESTOQUE\",\n" +
                    "\t\"price\": \"1000\"\n" +
                    "}", headers),
            String::class.java)

        assertEquals(HttpStatus.CREATED, result.statusCode)
    }

    @Test
    @Order(2)
    fun update() {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON

        val result = testRestTemplate.exchange(
            URI("http://localhost:8080/product/update"),
            HttpMethod.PUT,
            HttpEntity("{\"id\":1,\"name\":\"Mac Book Teste\",\"description\":\"Esse é um produto\",\"status\":\"EM_ESTOQUE\",\"price\":1000.00}", headers),
            String::class.java)

        assertEquals(HttpStatus.OK, result.statusCode)
    }

    @Test
    @Order(3)
    fun find() {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON

        val result = testRestTemplate.exchange(
            URI("http://localhost:8080/product/find/1"),
            HttpMethod.GET,
            HttpEntity("", headers),
            String::class.java)

        assertEquals(HttpStatus.OK, result.statusCode)
        assertEquals("{\"id\":1,\"name\":\"Mac Book Pro\",\"description\":\"Esse é um produto\",\"status\":\"EM_ESTOQUE\",\"price\":1000.00}", result.body)
    }

    @Test
    @Order(4)
    fun list() {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON

        val result = testRestTemplate.exchange(
            URI("http://localhost:8080/product/list"),
            HttpMethod.GET,
            HttpEntity("", headers),
            String::class.java)

        assertEquals(HttpStatus.OK, result.statusCode)
        assertEquals("[{\"id\":1,\"name\":\"Mac Book Pro\",\"description\":\"Esse é um produto\",\"status\":\"EM_ESTOQUE\",\"price\":1000.00}]", result.body)
    }
}