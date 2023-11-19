package com.subproblem.kotlinspringcrud.service

import com.subproblem.kotlinspringcrud.dto.AuthorRequest
import com.subproblem.kotlinspringcrud.dto.AuthorWithBooks
import com.subproblem.kotlinspringcrud.dto.BookDto
import com.subproblem.kotlinspringcrud.entity.Author
import com.subproblem.kotlinspringcrud.repository.AuthorRepository
import org.springframework.stereotype.Service

@Service
class AuthorService (
    private val authorRepository: AuthorRepository
){

    fun addAuthor(author: AuthorRequest) {
        val newAuthor = Author(
            firstName = author.firstname,
            lastName = author.lastname
        )

        authorRepository.save(newAuthor);
    }

    fun getAuthor(id: Int): AuthorRequest {
        val author = authorRepository.findById(id)
            .orElseThrow { NoSuchElementException("Author not found") }

        return  AuthorRequest(
            firstname = author.firstName,
            lastname = author.lastName
        )

    }

    fun getAuthorsWithBooks(): List<AuthorWithBooks> {

        val authorsWithBooks = authorRepository.findAllAuthorsWithBooks()

        return authorsWithBooks.map { convertToAuthorWithBooks(it) }
    }


    private fun convertToAuthorWithBooks(author: Author): AuthorWithBooks {
        val bookDtos = author.books.map { BookDto(it.name, it.price) }
        return AuthorWithBooks(author.firstName, author.lastName, bookDtos)
    }
}