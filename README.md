# Gradia Backend

## Overview
Gradia Backend is a Spring Boot application designed to serve as the backend for the Gradia platform. It provides RESTful APIs, database integration with PostgreSQL,
 and follows modern backend development practices.

## Tech Stack
- **Java**: 21
- **Framework**: Spring Boot 4.0.3
- **Database**: PostgreSQL
- **Migration**: Flyway
- **Containerization**: Docker & Docker Compose
- **Documentation**: OpenAPI (Swagger)
- **Security**: Spring Security

## Prerequisites
- Java 21 or higher
- Maven 3.9+
- Docker & Docker Compose

## Getting Started

### 1. Clone the Repository
```bash
git clone <repository-url>
cd Gradia_bacckend
```

### 2. Environment Configuration
Copy the example environment file and configure it:
```bash
cp .env.example .env
```
Update `.env` with your local configuration if needed.

### 3. Run with Docker Compose
To start the application and the database:
```bash
docker-compose up --build
```
The application will be available at `http://localhost:9800`.

### 4. Run Locally
Ensure you have a PostgreSQL database running and updated in `application.yml` or `.env`.

```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```
## Test
```bash
./mvnw test
```

## API Documentation
Once the application is running, you can access the Swagger UI at:
`http://localhost:9800/swagger-ui.html`

## Build for Production
To build the Docker image:
```bash
docker build -t gradia-backend .
```

## Project Structure
- `src/main/java`: Source code
- `src/main/resources`: Configuration and resources
- `src/test`: Unit and integration tests
- `Dockerfile`: Docker build configuration
- `docker-compose.yml`: Local development infrastructure

## License
[License Name]
