# 📘 Course Management REST API Project

This is a Spring Boot REST API project for managing course records with full CRUD (Create, Read, Update, Delete) functionality. It follows layered architecture and uses MySQL as the backend database. APIs are well-documented using Swagger UI.

## 🚀 Technologies Used

- Java 17 / Java 21
- Spring Boot
- Spring MVC (RESTful APIs)
- Spring Data JPA
- MySQL Database
- Maven
- Swagger UI (OpenAPI)
- IntelliJ IDEA / STS
- Postman (for testing)

## 📂 Project Structure

springboot-rest-api/
│
├── src/
│   ├── main/
│   │   ├── java/com/pawan/
│   │   │   ├── controller/
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── CourseManagementApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/test/
│           └── CourseManagementApplicationTests.java
│
├── pom.xml
└── README.md

## 📬 REST API Endpoints

| Method | Endpoint          | Description          |
|--------|-------------------|----------------------|
| GET    | `/courses`        | Get all courses      |
| GET    | `/courses/{id}`   | Get course by ID     |
| POST   | `/courses`        | Add a new course     |
| PUT    | `/courses/{id}`   | Update course by ID  |
| DELETE | `/courses/{id}`   | Delete course by ID  |

## 📒 API Documentation using Swagger

The project includes Swagger UI integration for interactive API documentation.

- 🔗 Visit: `http://localhost:8080/swagger-ui/index.html`

## 🧪 How to Run Locally

1. Clone the repository
2. Create `course_db` in MySQL
3. Update `application.properties`
4. Run the app from IntelliJ or STS
5. Test with Swagger or Postman

## 👤 Author

**Pawan Jha**  
GitHub: [@thepawancoder](https://github.com/thepawancoder)  
LinkedIn: [linkedin.com/in/thepawancoder](https://linkedin.com/in/thepawancoder)
