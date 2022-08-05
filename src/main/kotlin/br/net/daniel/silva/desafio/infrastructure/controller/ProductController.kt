package br.net.daniel.silva.desafio.infrastructure.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductController {

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    fun create() {

    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    fun update() {

    }

    @GetMapping("/find/{id}")
    fun find(@PathVariable("id") id: Int): ResponseEntity<String> {
        return ResponseEntity.ok("Teste find")
    }

    @GetMapping("/list")
    fun list(): ResponseEntity<String> {
        return ResponseEntity.ok("Teste list")
    }
}