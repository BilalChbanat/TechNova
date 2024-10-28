# User Management System - Spring Framework

This application is a basic **User Management System** built using **Spring Core** (without Spring Boot), **Spring MVC**, and **Spring Data JPA**. It allows users to perform **CRUD** operations such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

## Project Structure
The project is structured into multiple layers:
- **Controller**: Manages HTTP requests and responses.
- **Service**: Contains business logic.
- **Repository**: Handles data access using Spring Data JPA.
- **Model**: Defines the `Utilisateur` (User) entity.

## Dependency Injection (DI)
The project uses **Spring's DI** to inject dependencies via **constructor injection**, **setter injection**, and **interface injection**.

## Inversion of Control (IoC)
IoC is managed by Spring’s **ApplicationContext**, allowing the framework to control object lifecycle and dependencies.

## Spring Beans
The `Utilisateur` entity and other components are managed as **Spring Beans**, with defined scopes and lifecycle management.

## Bean Scopes
Two bean scopes are used:
- **Singleton**: A single instance of a bean is created and shared.
- **Prototype**: A new instance is created for every request.

## ApplicationContext
The `ApplicationContext.xml` configuration file is used to set up beans and define dependency injection strategies.

## Component Scanning and Stereotype Annotations
Annotations like `@Component`, `@Service`, and `@Repository` are used to enable **component scanning** and manage beans automatically.

## Spring Data JPA
The project uses **Spring Data JPA** for persistence, enabling easy CRUD operations on the `Utilisateur` entity. The database configuration is done via XML.

## Spring MVC
The **Spring MVC** framework is used to handle web requests, allowing users to interact with the system through a web interface for managing user data.

## UML
![image](https://github.com/user-attachments/assets/d78cdb46-20e2-48df-9145-9bfb0f18a744)


## Installation and Setup
1. Clone the repository.
2. Set up a **relational database** (e.g., PostgreSQL) and configure the connection in `ApplicationContext.xml`.
3. Run the application on a server (e.g., Apache Tomcat).
4. Access the web interface via your browser to perform CRUD operations.
