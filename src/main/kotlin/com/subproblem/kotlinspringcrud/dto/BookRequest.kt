package com.subproblem.kotlinspringcrud.dto

import java.math.BigDecimal

data class BookRequest(
    var name: String,
    var price: BigDecimal,
    var author: Int
) {

}
