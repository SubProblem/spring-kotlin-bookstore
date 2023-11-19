package com.subproblem.kotlinspringcrud.service

import com.subproblem.kotlinspringcrud.dto.BookDto
import com.subproblem.kotlinspringcrud.dto.BookRequest
import com.subproblem.kotlinspringcrud.entity.Book
import com.subproblem.kotlinspringcrud.repository.AuthorRepository
import com.subproblem.kotlinspringcrud.repository.BookRepository
import org.springframework.stereotype.Service


@Service
class BookService(
    private val bookRepository: BookRepository,
    private val authorRepository: AuthorRepository
) {

    fun addBooks(books: List<BookRequest>) {

        val bookEntities = books.map { book ->
            val author = authorRepository.findById(book.author)
                .orElseThrow { NoSuchElementException("Author not found") }
            Book(
                name = book.name,
                price = book.price,
                author = author
            )
        }
        bookRepository.saveAll(bookEntities)
    }

    fun getBooks(): List<BookDto> {
        return bookRepository.findAll()
            .map { book -> BookDto(
                name = book.name,
                price = book.price
            ) }
    }


}