package com.subproblem.kotlinspringcrud.controller

import com.subproblem.kotlinspringcrud.dto.AuthorRequest
import com.subproblem.kotlinspringcrud.dto.AuthorWithBooks
import com.subproblem.kotlinspringcrud.service.AuthorService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/author")
class AuthorController(
    private val authorService: AuthorService
) {

    @GetMapping
    fun getAllAuthorsWithBooks(): List<AuthorWithBooks> {
        return authorService.getAuthorsWithBooks()
    }

    @PostMapping
    fun addAuthor(@RequestBody authorRequest: AuthorRequest) {
        return authorService.addAuthor(authorRequest)
    }

    @GetMapping("/{id}")
    fun getAuthor(@PathVariable id: Int): AuthorRequest {
        return authorService.getAuthor(id)
    }
}