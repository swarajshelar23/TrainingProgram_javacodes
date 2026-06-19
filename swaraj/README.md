# Swaraj - Spring Boot Application

A Java-based Spring Boot application demonstrating modern web development practices and training concepts.

## Overview

This project showcases a complete Spring Boot application with REST API endpoints, database integration, and enterprise-grade architecture patterns. It serves as a practical training platform for Java development.

## Technologies Used

- **Java 17** - Programming language
- **Spring Boot 4.1.0** - Application framework
- **Spring Data JPA** - Data persistence layer
- **Spring WebMVC** - REST API development
- **MySQL** - Relational database
- **H2 Console** - In-memory database and debugging
- **Maven** - Build and dependency management

## Project Structure

```
swaraj/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/trainingprogram/swaraj/
│   │   │       ├── controller/    # REST controllers
│   │   │       ├── service/       # Business logic
│   │   │       ├── repository/    # Data access layer
│   │   │       ├── entity/        # JPA entities
│   │   │       └── SwarajApplication.java  # Main entry point
│   │   └── resources/
│   │       └── application.properties  # Configuration
│   └── test/
│       └── java/                   # Unit tests
├── pom.xml                         # Maven configuration
└── mvnw / mvnw.cmd                # Maven wrapper scripts
```

## Getting Started

### Prerequisites

- Java 17 or higher installed
- Maven 3.6+ (or use the included Maven wrapper)
- MySQL server running (for production) or use H2 for development

### Installation

1. Clone or navigate to the project directory:

   ```bash
   cd swaraj
   ```

2. Build the project:
   ```bash
   ./mvnw clean install
   ```
   On Windows:
   ```cmd
   mvnw.cmd clean install
   ```

### Running the Application

Start the application using:

```bash
./mvnw spring-boot:run
```

Or on Windows:

```cmd
mvnw.cmd spring-boot:run
```

The application will start on `http://localhost:8080` by default.

### Database Configuration

Update `src/main/resources/application.properties` with your database configuration:

```properties
# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/swaraj_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=true
```

### H2 Console (Development)

Access the H2 console at: `http://localhost:8080/h2-console`

## API Endpoints

The application provides REST endpoints through the following controllers:

- **OrderController** - Order management operations
- Additional controllers available in the `controller` package

## Key Features

- RESTful API design
- JPA entity mapping and persistence
- Separation of concerns (Controller → Service → Repository)
- H2 database support for rapid development
- MySQL support for production environments
- Maven-based build and dependency management

## Building the Project

### Clean Build

```bash
./mvnw clean build
```

### Run Tests

```bash
./mvnw test
```

### Package as JAR

```bash
./mvnw package
```

The generated JAR file will be available in the `target/` directory.

## Development Notes

- The project uses Spring Boot starter dependencies for simplified configuration
- JPA annotations are used for ORM mapping
- REST controllers use Spring's annotation-based configuration
- Service layer handles business logic separation

## Troubleshooting

### Port Already in Use

If port 8080 is already in use, configure a different port:

```properties
server.port=8081
```

### Database Connection Issues

- Ensure MySQL is running and accessible
- Verify credentials in `application.properties`
- Check network connectivity if using remote database

### Build Failures

- Clear Maven cache: `./mvnw clean`
- Verify Java 17 installation: `java -version`
- Check internet connection for dependency downloads

## Contributing

When contributing to this project:

1. Follow Spring Boot best practices
2. Maintain the existing package structure
3. Add appropriate JPA annotations to entities
4. Write unit tests for new features

## Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA Documentation](https://spring.io/projects/spring-data-jpa)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [Java 17 Documentation](https://docs.oracle.com/en/java/javase/17/)

## License

This project is part of a training program.

---

**Last Updated:** 2026-06-19
