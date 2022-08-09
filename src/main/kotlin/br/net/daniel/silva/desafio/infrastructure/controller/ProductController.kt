package br.net.daniel.silva.desafio.infrastructure.controller

import br.net.daniel.silva.desafio.domain.product.factory.ProductFactory
import br.net.daniel.silva.desafio.domain.product.valueobject.ProductOutputDTO
import br.net.daniel.silva.desafio.infrastructure.dto.RequestProductDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController(@Autowired private val factory: ProductFactory) {

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody productRequest: RequestProductDTO) = factory.createProductFactory(productRequest)

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    fun update(@RequestBody productRequest: RequestProductDTO) = factory.updateProductFactory(productRequest)

    @GetMapping("/find/{id}")
    fun find(@PathVariable("id") id: Int): ResponseEntity<ProductOutputDTO> = ResponseEntity.ok(factory.findProductUseCase(id))

    @GetMapping("/list")
    fun list(): ResponseEntity<MutableList<ProductOutputDTO>> = ResponseEntity.ok(factory.listProductUseCase())
}