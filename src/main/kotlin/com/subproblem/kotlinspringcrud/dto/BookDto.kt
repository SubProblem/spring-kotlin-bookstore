package com.subproblem.kotlinspringcrud.dto

import com.subproblem.kotlinspringcrud.entity.Author
import java.math.BigDecimal

data class BookDto(
    var name: String,
    var price: BigDecimal
)
