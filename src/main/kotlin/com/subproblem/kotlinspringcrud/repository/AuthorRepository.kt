package com.subproblem.kotlinspringcrud.repository;

import com.subproblem.kotlinspringcrud.entity.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface AuthorRepository : JpaRepository<Author, Int> {

    @Query("select distinct author FROM Author author join fetch author.books")
    fun findAllAuthorsWithBooks(): List<Author>
}