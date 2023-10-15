# <h1 align = "center"> Instagram Backend </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview
<p align="center">This project,  Instagram Backend," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information. 
</p>

<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [API reference](#api-reference)
5. [License](#license)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used
- Java 8
- Spring Boot
- Spring Web Initializer
- Maven
- Spring Web Dependency
- SQL DRIVER
- JPA
- SWAGGER
- sQL DATABASE
- ManyToOne Mapping

## Model Classes
- user Entity :-The user entity represents an user record in your Spring Boot application. It is used to store information about a user's user, including details such as name, email, phone number, zipcode. This entity is associated with the User entity through a Many-to-one relationship.
- Post Entity :-The fields in the post entity represent specific attributes associated with a product in your Spring Boot application. These fields capture information about the save post and get post.
## Controller Class
- user Controller :-The user Controller is a Spring MVC controller class responsible for handling HTTP requests related to user operations in your Spring Boot application.

- post Controller :-The ProductController is a Spring MVC controller class responsible for handling HTTP requests related to product operations in your Spring Boot application.

## Service Class
- user Service :-The userService is a service class in your Spring Boot application responsible for handling user-related operations. It includes the addAlluser method, which allows you to add multiple useres to your system.
- post Service :-The OrderService is a service class in your Spring Boot application responsible for handling order-related operations. It includes the save post and get post, which allow you to retrieve all post and add new postto your system, respectively.

<!-- Key Features -->
## Key Features
- Get post by Id.
- Get all post.
- Post user .
- sign up user.
- Update user by id with phoneNumber.

<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to CRUD Operation And Custom finder.

### Controller:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### API Reference

#### Add Users :
PostMethod :  http://localhost:8080/posts
### UPdate User:
PutMapping : http://localhost:8080/user/Id


#### Get All Users :
 - GET Method : http://localhost:8080/get

 

 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : HEMANT PATEL   -
- Maild Id : hemant959singh@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>
*  instagram Backend
