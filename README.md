# Student Data Management System

### Overview

This is a RESTful API developed using Spring Boot and MySQL for managing student data in a school. The system supports basic CRUD (Create, Read, Update, Delete) operations, as well as searching and sorting features. It is designed to help administrators manage student records effectively and to provide easy access to student data for other applications or front-end clients.

### Features

* CRUD Operations: Create, read, update, and delete student records.
* Search: Search for students by name or student ID.
* Sorting: Sort student records by grade.
* Error Handling: Provides user-friendly error messages for invalid inputs.
* API Documentation: Interactive API documentation via Swagger UI.

### Technologies Used
* Java 21
* Spring Boot - RESTful API development
* Spring Data JPA - Database access and persistence
* MySQL - Database for storing student data
* Swagger - API documentation
* Maven - Dependency management

## Setup Instructions
### Prerequisites
* Java (version 11 or later)
* Maven (for dependency management)
* MySQL (for database)

### Installation
* Clone the Repository
``` shell
  git clone https://github.com/your-username/student-management-system.git
  cd student-management-system
```
```bash
  git clone https://github.com/your-username/student-management-system.git
  cd student-management-system
```

### Configure the Database
* Create a MySQL database called `student_management`.
* Update the `application.properties` file in `src/main/resources` with your database connection details:
```
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run the Application

### Access the API Documentation
* Open your browser and navigate to http://localhost:8080/swagger-ui/index.html to access the Swagger API documentation.

## API Endpoints

### Base URL
```http://localhost:8080/students```

### Endpoints Summary

Endpoints Summary
| Method |	Endpoint |	Description |
| --- | --- | --- |
|GET|	/api/students|	Retrieve all students|
|POST|	/api/students|	Create a new student|
|GET|	/api/students/{id}|	Retrieve a student by ID|
|PUT|	/api/students/{id}|	Update student details by ID|
|DELETE|	/api/students/{id}|	Delete a student by ID|


### Error Handling
The API provides meaningful error messages for invalid input or operations. For example:
* 404 Not Found if a student with the specified ID does not exist.

### Project Structure
The project follows a standard layered architecture:

* Controller: Handles incoming HTTP requests and returns responses.
* Service: Contains business logic and communicates between the controller and the repository.
* Repository: Provides database access and querying.
* Model: Represents the Student entity.
* Exception: Custom exception handling for error management.

### Future Enhancements
Some possible improvements to the project could include:

* Adding authentication and authorization to protect endpoints.
* Implementing pagination for student records to handle large datasets.
* Enhancing search capabilities to allow multiple search criteria.
* Adding frontend integration with a JavaScript framework like React or Vue.

### Contributing
If you'd like to contribute to this project, please fork the repository and create a pull request with your changes.
