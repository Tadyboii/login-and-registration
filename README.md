# User Login and Registration System

This is a Spring Boot application implemented in Kotlin, designed to provide a user login and registration system. The application uses PostgreSQL for the database, the Exposed framework for ORM, Thymeleaf for rendering, and Docker for containerization. Gradle is used as the build tool.

## Features
- User registration
- User login
- Persistent user data stored in PostgreSQL

## Technologies Used
- **Spring Boot**: Framework for building the application
- **Kotlin**: Programming language
- **PostgreSQL**: Relational database
- **Exposed Framework**: Kotlin ORM library
- **Thymeleaf**: Server-side rendering engine
- **Gradle**: Build tool
- **Docker**: Containerization

## Prerequisites
- Docker and Docker Compose installed
- Java 17 or higher installed
- Gradle installed

## Getting Started
### 1. Clone the Repository
```bash
git clone <repository-url>
cd <repository-directory>
```

### 2. Create an `.env` File
Create a `.env` file in the root directory of the project with the following content:
```dotenv
DATABASE_NAME=your_database_name
DATABASE_USER=your_database_user
DATABASE_PASSWORD=your_database_password
DATABASE_HOST=your_database_host
```
Replace `your_database_name`, `your_database_user`, `your_database_password`, and `your_database_host` with appropriate values.

### 3. Build and Run the Application with Docker Compose
Run the following command to build and start the application:
```bash
docker-compose up --build
```

### 4. Access the Application
Once the application is running, you can access it at [http://localhost:8080](http://localhost:8080).


## Build and Run Without Docker
If you prefer to run the application without Docker:
1. Configure the database connection in `application.properties` or `application.yml`.
2. Build the application using Gradle:
   ```bash
   ./gradlew build
   ```
3. Run the application:
   ```bash
   java -jar build/libs/<your-application-jar>.jar
   ```

## Contributing
Feel free to fork the repository and make contributions. Open a pull request to submit your changes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
