# Blog Management System - Backend (Spring Boot)

## Overview
This project is a **Spring Boot** backend service for managing blogs. It provides RESTful APIs for CRUD operations, integrates **AI-powered text summarization**, and is deployable on **AWS**.

## Features
- **Blog CRUD Operations** (Create, Read, Update, Delete)
- **Pagination Support** for fetching blogs efficiently
- **AI-based Summarization** using OpenAI API
- **Dockerized Deployment**
- **AWS Integration** (EC2, S3 for image storage, API Gateway)
- **JWT-based Authentication** (Optional)
- **Redis Caching** for optimized performance (Optional)

---

## Tech Stack
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA** (for database interactions)
- **PostgreSQL/MySQL** (for data storage)
- **OpenAI API** (for AI-based text summarization)
- **Docker**
- **AWS EC2 & S3** (for deployment & storage)

---

## API Endpoints
### **Blog Management**
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/api/blogs` | Create a new blog |
| `GET` | `/api/blogs?page=0&size=10` | Get all blogs with pagination |
| `GET` | `/api/blogs/{id}` | Get a single blog by ID |
| `PUT` | `/api/blogs/{id}` | Update a blog by ID |
| `DELETE` | `/api/blogs/{id}` | Delete a blog by ID |

### **AI Integration**
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/api/blogs/{id}/summarize` | Generate AI-based summary of a blog |

### **Authentication (Optional)**
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/api/auth/register` | User Registration |
| `POST` | `/api/auth/login` | User Login |

---

## Setup & Installation
### **1. Clone the Repository**
```sh
git clone https://github.com/your-username/blog-backend.git
cd blog-backend
```

### **2. Configure Database**
Update `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/blogdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### **3. Run the Application**
```sh
mvn spring-boot:run
```

### **4. Dockerize & Deploy**
Build and run the Docker container:
```sh
docker build -t blog-backend .
docker run -p 8080:8080 blog-backend
```
For AWS deployment, follow the AWS EC2 setup guide in the repository.

---

## Contribution
Feel free to fork this repository, make changes, and submit a pull request!

---

## License
MIT License
