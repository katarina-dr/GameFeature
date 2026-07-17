# 🎰 Game Feature Lab

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

## About

**Game Feature Lab** is a Spring Boot REST API developed as an internal tool for slot game development teams.

The application helps developers manage slot games, configure game features, organize development notes and maintain audit records during the development lifecycle.

Instead of being a slot game itself, this project demonstrates the backend architecture commonly used for internal game development tools.

---

## Features

### Game Management

* Create new games
* Update existing games
* Delete games
* Retrieve game information
* Track game status (Development, Testing, Production)

### Feature Management

* Create game features
* Enable or disable features
* Associate features with games

### Note Management

* Store development notes
* Track note authors
* Associate notes with games

### Audit Logging

* Record development actions
* Store timestamps automatically
* Associate audit logs with games

---

## Tech Stack

### Backend

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* Jakarta Validation

### Database

* PostgreSQL

### Build Tool

* Maven

---

## Architecture

```
Controller
      │
      ▼
 Service
      │
      ▼
Repository
      │
      ▼
 PostgreSQL
```

---

## Project Structure

```
src
└── main
    ├── java
    │   └── com.games.gamefeature
    │       ├── controller
    │       ├── entity
    │       ├── repository
    │       ├── service
    │       └── config
    └── resources
        └── application.properties
```

---

## REST API

### Games

| Method | Endpoint    |
| ------ | ----------- |
| GET    | /games      |
| GET    | /games/{id} |
| POST   | /games      |
| PUT    | /games/{id} |
| DELETE | /games/{id} |

### Features

| Method | Endpoint       |
| ------ | -------------- |
| GET    | /features      |
| GET    | /features/{id} |
| POST   | /features      |
| PUT    | /features/{id} |
| DELETE | /features/{id} |

### Notes

| Method | Endpoint    |
| ------ | ----------- |
| GET    | /notes      |
| GET    | /notes/{id} |
| POST   | /notes      |
| PUT    | /notes/{id} |
| DELETE | /notes/{id} |

---

## Database Entities

* Game
* Feature
* Note
* Audit

---

## Getting Started

### Clone repository

```bash
git clone https://github.com/katarina-dr/GameFeature.git
```

### Navigate to project

```bash
cd GameFeature
```

### Configure PostgreSQL

Update `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/gamefeature
spring.datasource.username=gamefeature
spring.datasource.password=postgres
```

### Run the application

```bash
mvn spring-boot:run
```

---

## Example JSON

```json
{
  "name": "Book of Egypt",
  "theme": "Egypt",
  "version": "1.0",
  "rtp": 96.3,
  "gridWidth": 5,
  "gridHeight": 3,
  "status": "DEVELOPMENT"
}
```

## Author

**Katarina Dragičević**

GitHub: https://github.com/katarina-dr
