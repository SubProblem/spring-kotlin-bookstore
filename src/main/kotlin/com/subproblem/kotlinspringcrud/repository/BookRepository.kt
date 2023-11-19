package com.subproblem.kotlinspringcrud.repository;

import com.subproblem.kotlinspringcrud.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Int> {
}