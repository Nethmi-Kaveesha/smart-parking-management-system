# smart-parking-management-system
# Smart Parking Management System (SPMS)

A microservice-based Smart Parking Management System built with Spring Boot, featuring:

- **User Service** — User registration, login, and management
- **Parking Service** — Managing parking spots and availability
- **Vehicle Service** — Vehicle registrations and details
- **Payment Service** — Payment processing for parking fees
- **Eureka Server** — Service discovery and registration
- **Config Server** — Centralized configuration management
- **API Gateway** — Routing and gateway for microservices

---

## Architecture Overview

This project uses **Spring Boot microservices** architecture with the following components:

- **Eureka Server:** Service registry for discovery of microservices
- **Config Server:** Central configuration management for all services
- **API Gateway:** Single entry point for routing requests to microservices
- **Microservices:** Independent Spring Boot services communicating via REST APIs

---

## Services

| Service         | Port  | Responsibilities                      |
|-----------------|-------|-------------------------------------|
| Eureka Server   | 8761  | Service discovery                   |
| Config Server   | 8888  | Centralized configuration           |
| API Gateway     | 8080  | Routes external requests to services|
| User Service    | 8081  | User registration, login, profiles  |
| Parking Service | 8082  | Parking spot management              |
| Vehicle Service | 8083  | Vehicle registrations and info      |
| Payment Service | 8084  | Payment processing                   |

---
### Eureka Dashboard Screenshot

![Eureka Dashboard](src/main/java/lk/ijse/smartparkms/screenshots/Screenshot%202025-06-17%20035833.png)

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.6+
- MySQL server (or your preferred database)
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Setup Instructions

1. **Clone the repository**
## Repository

[https://github.com/Nethmi-Kaveesha/smart-parking-management-system](https://github.com/Nethmi-Kaveesha/smart-parking-management-system)

---