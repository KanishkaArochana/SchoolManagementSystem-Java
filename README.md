# Student Management System Documentation

## Overview
The Student Management System is a Java-based application developed using Java Swing for the graphical user interface (GUI) and MySQL for database management. The system allows administrators to manage students, teachers, and principals within a school environment. The application is built using the Apache NetBeans IDE and provides functionalities such as adding, updating, deleting, and searching records.

## Features

### Login System:
- Secure login for administrators.
- Validation of username and password against the database.

### Student Management:
- View all students or filter by grade.
- Add, update, delete, and search student records.

### Teacher Management:
- View all teachers.
- Add, update, delete, and search teacher records.
- Upload and display images for teachers.

### Principal Management:
- View all principals.
- Add, update, delete, and search principal records.
- Upload and display images for principals.

### Database Integration:
- MySQL database for storing student, teacher, and principal information.
- JDBC for database connectivity.

### Welcome Screen:
- A welcome screen with a loading progress bar that transitions to the login screen.

## Technologies Used
- **Programming Language:** Java
- **GUI Framework:** Java Swing
- **Database:** MySQL
- **IDE:** Apache NetBeans
- **Database Connectivity:** JDBC (Java Database Connectivity)

## Database Schema
The database used in this project is named `schoolmanagement`. Below are the tables used in the system:

### Table: admin
Stores administrator login credentials.
- Columns: `id`, `username`, `password`

### Table: student
Stores student information.
- Columns: `id`, `name`, `grade`, `address`, `age`, `birthday`, `gender`, `admission`, `guardian`, `contact`

### Table: teacher
Stores teacher information.
- Columns: `id`, `name`, `address`, `age`, `birthday`, `gender`, `contact`, `image`

### Table: principal
Stores principal information.
- Columns: `id`, `name`, `address`, `age`, `birthday`, `gender`, `contact`, `image`, `pastpresent`

## How to Run the Project

### Prerequisites
- **Java Development Kit (JDK):** Ensure JDK is installed on your system.
- **Apache NetBeans IDE:** Download and install NetBeans from here.
- **MySQL Database:** Install MySQL and set up the `schoolmanagement` database with the required tables.
- **MySQL Connector/J:** Download the MySQL JDBC driver and add it to your project's libraries.

### Steps to Run the Project

1. **Clone the Repository:**
   - Clone the project repository to your local machine.

2. **Set Up the Database:**
   - Create a MySQL database named `schoolmanagement`.
   - Execute the SQL scripts to create the necessary tables (`admin`, `student`, `teacher`, `principal`).

3. **Open the Project in NetBeans:**
   - Open Apache NetBeans IDE.
   - Go to `File > Open Project` and select the project folder.

4. **Configure Database Connection:**
   - Update the `databaseConnection.java` file with your MySQL database credentials (username and password).

5. **Run the Project:**
   - Right-click on the project in the NetBeans IDE and select `Run`.
   - The application will start, and the welcome screen will appear with a loading progress bar.
   - After the progress bar completes, the login window will appear.

6. **Login:**
   - Use the default admin credentials (stored in the `admin` table) to log in.

7. **Navigate the System:**
   - After logging in, you can navigate through the system to manage students, teachers, and principals.

## Code Structure
The project is organized into several Java classes, each responsible for different functionalities:

### Welcome.java:
- Displays a welcome screen with a loading progress bar.
- Transitions to the login screen after the progress bar completes.

### Login.java:
- Handles the login functionality.
- Validates user credentials against the `admin` table.

### Home.java:
- The main dashboard after login.
- Provides buttons to navigate to student, teacher, and principal management sections.

### allStudents.java:
- Displays a list of all students.
- Allows filtering students by grade.

### student.java:
- Handles the addition, updating, deletion, and searching of student records.

### AllTeacher.java:
- Displays a list of all teachers.
- Provides options to add, update, delete, and search teacher records.

### Teacher.java:
- Handles the addition, updating, deletion, and searching of teacher records.
- Allows uploading and displaying images for teachers.

### AllPrincipal.java:
- Displays a list of all principals.
- Provides options to add, update, delete, and search principal records.

### Principal.java:
- Handles the addition, updating, deletion, and searching of principal records.
- Allows uploading and displaying images for principals.

### databaseConnection.java:
- Manages the database connection using JDBC.
- Provides a static method to establish a connection to the MySQL database.

## Screenshots
- **Welcome Screen**
- **Login Window**
- **Home Dashboard**
- **Student Management**
- **Teacher Management**
- **Principal Management**

## Conclusion
The Student Management System is a comprehensive application designed to manage school-related data efficiently. It provides a user-friendly interface for administrators to handle student, teacher, and principal records. The system is built using Java Swing and MySQL, making it a robust and scalable solution for school management.
