# Highway Ticket Management System - Microservice Application

## Introduction

In today's dynamic transportation landscape, managing highway tickets efficiently is crucial for ensuring smooth traffic flow and compliance with regulations. This project aims to develop a robust microservice-based backend application for a Highway Ticket Management System. The system will streamline ticket issuance, vehicle registration, user management, and payment processing without relying on external payment gateways.

## Key Technologies

- Spring Boot
- Spring Cloud
  - Eureka for service discovery
  - Spring Cloud Config for centralized configuration management
  - Spring Cloud Gateway for intelligent routing
## Architecture

This application is composed of several microservices:

- Service Registry and Discovery (Eureka)
- Configuration Server (Spring Cloud Config)
- API Gateway (Spring Cloud Gateway)
- Ticket Service
- Vehicle Service
- User Service
- Payment Service
## Table of Contents

- Service Registry and Discovery
- Configuration Server
- API Gateway
- Microservices
- Ticket Service
- Vehicle Service
- User Service
- Payment Service

## Service Registry and Discovery

### Purpose

Eureka enables microservices to register themselves and discover other services dynamically, facilitating communication without hardcoded dependencies.

### Implementation

- Each microservice registers with Eureka upon startup.
- Microservices query Eureka to locate and communicate with other services.
### Configuration

- Eureka Server: Hosts the service registry.
- Eureka Clients: Register services and query the registry for service discovery.
## Configuration Server

### Purpose

Centralizes configuration management, allowing microservices to fetch and update configurations without redeployment.

### Implementation

- Spring Cloud Config Server: Stores and serves configuration files.
- Microservices retrieve configurations at startup and periodically for updates.
### Configuration

- Configurations are stored in a Git repository for versioning and easy updates.
- Each microservice is configured to point to the Config Server.
## API Gateway

### Purpose

Acts as a single-entry point for client requests, routing them to the appropriate microservices.

### Implementation

- Spring Cloud Gateway: Routes requests based on URI and HTTP method.
- Integrates with Eureka for dynamic routing and load balancing.
### Configuration

- Defines routes for each microservice.
## Microservices

### Ticket Service

#### Business Logic

Manages the lifecycle of highway tickets.

#### Functions

- Create new tickets.
- Update ticket status.
- R- etrieve ticket information.
### Vehicle Service

#### Business Logic

Handles vehicle operations and information.

#### Functions

- Register new vehicles.
- Update vehicle details.
- Retrieve vehicle information.
### User Service

#### Business Logic

Manages user and owner profiles.

#### Functions

- Register new users.
- Update user profiles.
- Verify user credentials.
### Payment Service

#### Business Logic

Facilitates secure internal payment processing.

#### Functions

- Validate payment details.
- Update ticket statuses upon successful payment.
Clone the Repository:
```
git clone https://github.com/your-username/highway-ticket-management.git
cd highway-ticket-management
```
Run the Services:

Start the Eureka Server:
```
cd service-registry-hts
mvn spring-boot:run
Start the Config Server:
```
```
cd config-server-hts
mvn spring-boot:run
Start the API Gateway:
```
```
cd api-gateway-hts
mvn spring-boot:run
Start each microservice:
```
```
cd ticket-service
mvn spring-boot:run
cd vehicle-service
mvn spring-boot:run
cd user-service
mvn spring-boot:run
cd payment-service
mvn spring-boot:run
```
Access Services:

- Eureka Dashboard: http://localhost:8761
- API Gateway: http://localhost:8080

Fork the repository.
Create a feature branch: git checkout -b feature/your-feature
Commit your changes: git commit -m 'Add some feature'
Push to the branch: git push origin feature/your-feature
Open a pull request.
