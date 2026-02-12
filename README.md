# 🎓 Student Management REST API

A production-style Student Management REST API built using Spring Boot following a clean layered architecture (Controller → Service → Repository).  

The project implements the DTO pattern with ModelMapper for secure data transfer, pagination for scalable data retrieval, and global exception handling for professional API responses.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- ModelMapper
- Maven

---

## 🏗 Project Architecture

This project follows clean layered architecture:

Controller → Service → Repository → Database

### 🔹 Controller Layer
Handles HTTP requests and responses.

### 🔹 Service Layer
Contains business logic and converts DTO ↔ Entity using ModelMapper.

### 🔹 Repository Layer
Extends JpaRepository for database interaction.

### 🔹 DTO Layer
Prevents exposing internal entity structure to API clients.

### 🔹 Global Exception Handling
Handles runtime errors and returns proper HTTP status codes.

---

## ✨ Features

- ✅ Create Student
- ✅ Get Student by ID
- ✅ Get All Students (Pagination Supported)
- ✅ Update Student
- ✅ Delete Student
- ✅ DTO Pattern Implementation
- ✅ ModelMapper Integration
- ✅ Global Exception Handling
- ✅ Proper HTTP Status Codes
- ✅ Clean Layered Architecture

---

## 📬 API Endpoints

### 🔹 Create Student
POST   http://localhost:8080/api/students

### 🔹 Get All Students (Paginated)
GET    http://localhost:8080/api/students?page=0&size=5

### 🔹 Get Student By ID
GET    http://localhost:8080/api/students/{id}

### 🔹 Update Student
PUT    http://localhost:8080/api/students/{id}

### 🔹 Delete Student
DELETE http://localhost:8080/api/students/{id}

---

## 🗄 Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


## 📦 Sample Request Body

```json
{
  "firstName": "You Name",
  "email": "YourEmail@1234.com",
  "course": "B.Tech"
}

