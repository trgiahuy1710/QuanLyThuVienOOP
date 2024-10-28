# QuanLyThuVienOOP
Final project của lập trình hướng đối tượng java kết nối MySQL
# Java OOP Project with MySQL Integration

This project is a Java-based application developed using Object-Oriented Programming (OOP) principles. It connects to a MySQL database for data storage and retrieval. The application simulates a simple library management system, allowing librarians and readers to manage and access book and transaction data.

## Features

- **User Registration and Authentication**: Separate signup and login processes for librarians and readers.
- **Book Management**: Enables librarians to add, update, or remove book records.
- **Transaction Management**: Tracks book loans, returns, and availability.
- **Data Persistence with MySQL**: Stores user, book, and transaction data in a MySQL database.

## Technologies Used

- **Java**: Core programming language.
- **MySQL**: Relational database for storing and managing data.
- **JDBC (Java Database Connectivity)**: Used to connect and interact with MySQL.
- **Eclipse/IntelliJ IDEA**: Integrated development environments for building and running the application.

## Project Structure

- **model**: Contains the classes that represent the core entities (e.g., `Librarian`, `Reader`, `Book`).
- **dao**: Data Access Objects (DAOs) for database operations.
- **view**: UI or console-based components for user interaction.
- **controller**: Logic that handles application flow and connects the view and model.

## Getting Started

### Prerequisites

1. **Java Development Kit (JDK)**: Version 8 or later.
2. **MySQL Database**: Install MySQL Server and create the required database.
3. **IDE**: Use Eclipse, IntelliJ IDEA, or any other preferred IDE.
4. **MySQL Connector/J**: Download and add the MySQL Connector/J JAR file to your project libraries.

### Database Setup

1. **Create a Database**: 
   ```sql
   CREATE DATABASE library_db;
