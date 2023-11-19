package com.subproblem.kotlinspringcrud.dto

data class AuthorWithBooks(
    var firstname: String,
    var lastname: String,
    var books: List<BookDto>
)
