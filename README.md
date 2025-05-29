# Tests Project

A simple Java project using Spring Boot and Gradle to demonstrate basic application structure and unit testing with JUnit.

## Table of Contents

* [Overview](#overview)
* [Prerequisites](#prerequisites)
* [Getting Started](#getting-started)
* [Project Structure](#project-structure)
* [Running the Application](#running-the-application)
* [Running Tests](#running-tests)
* [Configuration](#configuration)
* [Contributing](#contributing)
* [License](#license)

## Overview

This project contains a Spring Boot application and a utility class `NumberChecker` with accompanying unit tests. It serves as a template for:

* Organizing source code and resources
* Building and running with Gradle
* Writing and running JUnit tests

## Prerequisites

* Java Development Kit (JDK) 11 or higher
* Gradle 7.x (or use the Gradle Wrapper included)
* Git (for version control)

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/barteked/Tests.git
   cd Tests
   ```

2. Build the project using the Gradle Wrapper:

   ```bash
   ./gradlew clean build
   ```

## Project Structure

```
Tests
├── build.gradle           # Gradle build script
├── settings.gradle        # Gradle settings
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/example/tests
│   │   │       ├── NumberChecker.java      # Utility class for number validation
│   │   │       └── TestsApplication.java   # Main Spring Boot application class
│   │   └── resources
│   │       └── application.properties      # Spring Boot configuration
│   └── test
│       └── java
│           └── com/example/tests
│               ├── NumberCheckerTest.java  # Unit tests for NumberChecker
│               └── TestsApplicationTests.java # Spring Boot context tests
├── .gitignore             # Git ignore rules
└── HELP.md                # Project help/documentation
```

## Running the Application

To start the Spring Boot application:

```bash
./gradlew bootRun
```

The application will start on the default port (8080). You can configure this in `application.properties`.

## Running Tests

Execute all unit tests with:

```bash
./gradlew test
```

## Configuration

Edit `src/main/resources/application.properties` to customize your application settings. For example, to change the server port:

```properties
server.port=8081
```

## Contributing

Contributions are welcome! Please fork the repository, make your changes, and open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
