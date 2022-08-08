package br.net.daniel.silva.desafio.infrastructure.model

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "PRODUCT")
open class ProductEntity (
    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open val id: Int? = null,

    @Column(name = "PRODUCT_NAME")
    open val name: String? = null,

    @Column(name = "PRODUCT_DESCRIPTION")
    open val description: String? = null,

    @Column(name = "PRODUCT_STATUS")
    open val status: String? = null,

    @Column(name = "PRODUCT_CREATE_DATE")
    open val createDate: LocalDateTime? = null,

    @Column(name = "PRODUCT_MODIFY_DATE")
    open val modifyDate: LocalDateTime? = null,

    @Column(name = "PRODUCT_PRICE")
    open val price: BigDecimal? = null
)