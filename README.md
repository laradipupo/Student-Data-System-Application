# Student Data Management System

## Overview

This is a RESTful API developed using Spring Boot and MySQL for managing student data in a school. The system supports basic CRUD (Create, Read, Update, Delete) operations, as well as searching and sorting features. It is designed to help administrators manage student records effectively and to provide easy access to student data for other applications or front-end clients.

## Features

* CRUD Operations: Create, read, update, and delete student records.
* Search: Search for students by name or student ID.
* Sorting: Sort student records by grade.
* Error Handling: Provides user-friendly error messages for invalid inputs.
* API Documentation: Interactive API documentation via Swagger UI.

## Technologies Used
* Java 21
* Spring Boot - RESTful API development
* Spring Data JPA - Database access and persistence
* MySQL - Database for storing student data
* Swagger - API documentation
* Maven - Dependency management

# Setup Instructions
## Prerequisites
* Java (version 11 or later)
* Maven (for dependency management)
* MySQL (for database)

## Installation
* Clone the Repository
``` shell
  git clone https://github.com/your-username/student-management-system.git
  cd student-management-system
```
```bash
  git clone https://github.com/your-username/student-management-system.git
  cd student-management-system
```

## Configure the Database
* Create a MySQL database called `student_management`.
* Update the `application.properties` file in `src/main/resources` with your database connection details:
```
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Run the Application

## Access the API Documentation
* Open your browser and navigate to http://localhost:8080/swagger-ui/index.html to access the Swagger API documentation.
