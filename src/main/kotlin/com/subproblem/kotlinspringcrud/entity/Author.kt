package com.subproblem.kotlinspringcrud.entity

import jakarta.persistence.*


@Entity
data class Author (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,
    var firstName: String,
    var lastName: String,

    @OneToMany(mappedBy = "author", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var books: MutableList<Book> = mutableListOf()
)
