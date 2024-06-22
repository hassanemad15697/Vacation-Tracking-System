# **Vacation Tracking System (VTS)**

## **Overview**

The Vacation Tracking System is an application designed to manage employee leave requests, approvals, and balances. The system ensures efficient tracking and reporting of vacation time and supports multiple roles with different access levels.

## **Table of Contents**
* Features
* Technology Stack
* Architecture
* Setup and Installation
* Usage
* Contributing
* License


## Features

* **User Management**: Registration, login, profile management, and role-based access control.
* **Leave Management**: Submit, approve, deny leave requests; view leave balances.
* **Leave Types and Balances**: Define different leave types, calculate and track leave balances.
* **Reporting and Analytics**: Generate and view reports on leave usage.
* **Notifications**: Email, SMS, and push notifications for leave request updates.
* **Integration**: Integration with external HR systems and calendar services.
* **Administrative Features**: Manage leave policies, holiday calendars, and configurations.
* **User Dashboard**: View leave balances, upcoming leaves, and pending requests.
* **Security**: Implement robust authentication and authorization mechanisms.
* **Compliance**: Ensure data protection and audit logging.

## Technology Stack

### Backend

* **Framework**: Spring Boot
* **ORM**: Hibernate, Spring Data JPA
* **Security**: Spring Security, JWT, OAuth2
* **Mail**: Spring Mail

### Frontend

Frameworks/Libraries:
* **Thymeleaf** (Server-side rendering)
* **UI Libraries**: Bootstrap, Tailwind CSS


### Database

* **Relational Databases**: PostgreSQL
* **Migration**: Liquibase


### Integration and API

* **API Design**: RESTful APIs
* **Third-party Integration**: Google Calendar API, Outlook API

### DevOps and Deployment

* **Containerization**: Docker
* **Orchestration**: Kubernetes
* **CI/CD**: Jenkins, GitHub Actions 
<!--* Cloud Providers: AWS, Azure, Google Cloud-->

### Monitoring and Logging

* **Monitoring**: Spring Boot Actuator
* **Logging**: ELK Stack (Elasticsearch, Logstash, Kibana)

### Testing

* **Unit and Integration Testing**: JUnit, Mockito
* **API Testing**: Postman

### Additional Tools

* **API Documentation**: Swagger, OpenAPI
* **Code Reduction**: Lombok
* **Object Mapping**: Mapper

## Architecture

### Backend
* **Controllers**: Handle incoming HTTP requests and route them to the appropriate service layer.
* **Services**: Contain business logic and interact with repositories.
* **Repositories**: Interact with the database using Spring Data JPA.
* **Security**: Configured using Spring Security, JWT, and OAuth2 for authentication and authorization.

### Frontend

**Server-side Rendering (SSR)**: using Thymeleaf, templates are rendered on the server and served to the client.

### Database

**Entities**: Represent data models mapped to database tables.
**Repositories**: Interface for CRUD operations on entities.

### Integration

* **External APIs**: Integration with third-party services for extended functionality.

## Setup and Installation

### Prerequisites

* Java 17 or higher
* Docker and Docker Compose
* PostgreSQL


### Clone the repository

git clone https://github.com/hassanemad15697/vacation-tracking-system.git
cd vacation-tracking-system/backend

### Configure the database

Update application.properties with your database configuration.

### Run the application

bash
Copy code
./mvnw spring-boot:run


bash
Copy code
npm start
Docker
Build and run the containers:
bash
Copy code
docker-compose up --build

# Usage

### Access the application

Open your browser and navigate to http://localhost:8080.

### Login or Register

Create a new account or log in with existing credentials.

### Submit Leave Requests

Navigate to the leave request page and submit your vacation request.

### Admin Functions

Manage users, leave types, and approvals from the admin dashboard.

## Contributors

* https://github.com/hassanemad15697
* https://github.com/eng-marwa

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.




