# Test doubles using Mountebank

## Currency Converter Service

The Currency Converter Service is a Spring Boot microservice designed to convert amounts from one currency to another.

### Features

- Convert currency from one to another
- Mocking external service responses using Mountebank for testing

### Prerequisites

- JDK 11 or later
- Gradle 6.x or later
- Docker

### Build the project using Gradle:

```bash
./gradlew build
```

### Start the application:

```bash
./gradlew bootRun
```

### Start Mountebank using Docker Compose:

```bash
docker-compose up -d
```

## API Usage

To convert currency, make a GET request to the `/convert` endpoint with the following mandatory query parameters:

- `amount`: The amount to convert.
- `from`: The currency code to convert from.
- `to`: The currency code to convert to.

#### Example request:

```bash
curl "http://localhost:8080/convert?amount=100&from=USD&to=EUR"
```

---
<p align="center">
  ⭐ Star this repository if it helped you!
</p>
