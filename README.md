# User Login and Registration System in Spring Boot

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
git clone https://github.com/Tadyboii/login-and-registration.git
cd login-and-registration
```

### 2. Create an `.env` File
Create a `.env` file in the root directory of the project with the following content:
```dotenv
DATABASE_NAME=your_database_name
DATABASE_USER=your_database_user
DATABASE_PASSWORD=your_database_password
DATABASE_HOST=your_database_host
DATABASE_PORT=your_database_port
```
Replace `your_database_name`, `your_database_user`, `your_database_password`, `your_database_host`, and `your_database_port` with your database configuration.

### 3. Build and Run the Application 
Run the following command to install dependencies:
```bash
./gradlew build
```
Then, run the database service with:
```bash
docker-compose up -d
```
Finally, run the application by running the `main` method in the `LoginAndRegistrationApplication.kt` class.

### 4. Access the Application
Once the application is running, you can access it at [http://localhost:8080](http://localhost:8080) if hosted locally.

## Contributing
Feel free to fork the repository and make contributions. Open a pull request to submit your changes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
