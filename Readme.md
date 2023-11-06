# Project

This is a simple Java Spring Boot application that manages a list of todos. The application is built with Maven and uses a MySQL database for persistence.

## Main Features

- **Todo Management**: The application allows you to create, read, update, and delete todos. Each todo has a title, description, and a status indicating whether it is done or not.

- **Database Persistence**: The application uses a MySQL database to persist the todos. The database connection details are configured in the `application.properties` file.

- **Spring Boot**: The application is built using Spring Boot, which simplifies the setup and development of Spring applications.

## Java Files

- [`DemoApplication.java`](src/main/java/com/example/demo/DemoApplication.java): This is the main entry point of the Spring Boot application. It also includes a `CommandLineRunner` bean that initializes the `TodoRepository` with some todos.

- [`Todo.java`](src/main/java/com/example/demo/Todo.java): This is the entity class that represents a todo. It includes fields for id, title, description, and done status, along with their getter and setter methods.

- [`TodoController.java`](src/main/java/com/example/demo/TodoController.java): This is the controller class that handles HTTP requests for todo management. It includes methods for getting all todos, getting a todo by id, creating a todo, updating a todo, and deleting a todo by id.

- [`TodoRepository.java`](src/main/java/com/example/demo/TodoRepository.java): This is the repository interface for performing CRUD operations on todos. It extends `JpaRepository`.

## GitHub Actions

The project uses a GitHub Action workflow defined in `.github/workflows/main_todomigraterpza.yml` to automate the build and deployment of the application to Azure Web App.

The workflow is triggered on every push to the `main` branch or when manually dispatched from the GitHub Actions tab.

Here is a brief explanation of the steps in the workflow:

1. **Checkout**: Checks out the code from the repository.

2. **Set up Java**: Sets up the specified Java version on the runner.

3. **Cache Maven packages**: Caches the Maven packages to speed up the build process.

4. **Build with Maven**: Builds the application using Maven. The `mvn clean install -B -V` command is used to clean the project, install the dependencies, and build the project in batch mode while displaying version info.

5. **Upload artifact for deployment job**: Uploads the built `.war` file as an artifact for the deployment job.

6. **Download artifact from build job**: Downloads the artifact in the deployment job.

7. **Login to Azure**: Logs in to Azure using the provided credentials.

8. **Deploy to Azure Web App**: Deploys the application to the specified Azure Web App.

Please refer to the workflow file for more details and adjust the settings as needed for your environment.