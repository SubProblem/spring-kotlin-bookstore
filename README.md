# Spring Boot CRUD Application - Author & Book Management

This project showcases a Kotlin-based CRUD application using Spring Boot for managing authors and books. It utilizes PostgreSQL as the underlying database.

## Overview

The application provides endpoints for managing authors and books, enabling CRUD operations for both entities. It's structured to handle author details, books associated with authors, and basic RESTful interactions.

## Features

- **Author Management:** Allows creating, retrieving, and updating author details, including associated books.
- **Book Management:** Enables adding, retrieving, and managing books, each linked to an author.
- **RESTful API:** Provides API endpoints for author and book operations.

## Technologies Used

- **Kotlin:** Language used for the project.
- **Spring Boot:** Framework used for developing the application.
- **PostgreSQL:** Database used for data storage.
- **Gradle:** Build tool and dependency management.
- **RESTful API:** Interface for interacting with the application.

## Endpoints

### Author Endpoints

- **Get All Authors:** `GET /api/v1/author` - Retrieves all authors with their associated books.
- **Add Author:** `POST /api/v1/author` - Adds a new author.
- **Get Author Details:** `GET /api/v1/author/{id}` - Retrieves details of a specific author.

### Book Endpoints

- **Add Books:** `POST /api/v1/book` - Adds multiple books associated with their respective authors.
- **Get All Books:** `GET /api/v1/book` - Retrieves all available books.

