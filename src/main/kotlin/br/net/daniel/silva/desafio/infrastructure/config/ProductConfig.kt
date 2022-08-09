package br.net.daniel.silva.desafio.infrastructure.config

import br.net.daniel.silva.desafio.domain.product.factory.ProductFactory
import br.net.daniel.silva.desafio.infrastructure.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ProductConfig {

    @Bean
    fun createFactory(@Autowired service: ProductService): ProductFactory = ProductFactory(service)
}