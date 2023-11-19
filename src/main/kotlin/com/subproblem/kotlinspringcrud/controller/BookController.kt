package com.subproblem.kotlinspringcrud.controller

import com.subproblem.kotlinspringcrud.dto.BookDto
import com.subproblem.kotlinspringcrud.dto.BookRequest
import com.subproblem.kotlinspringcrud.service.BookService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/book")
class BookController(
    private val bookService: BookService
) {

    @PostMapping
    fun addBooks(@RequestBody books: List<BookRequest>) {
        bookService.addBooks(books)
    }

    @GetMapping
    fun getBooks(): List<BookDto> {
        return bookService.getBooks()
    }
}