README.md

Task Manager (Spring Boot)
A simple REST API for managing tasks with fields like title, description, deadline, priority, and status.

## Features

* Add new tasks.
* List all tasks.
* Update tasks.
* Delete tasks.
* Mark tasks as completed.

📋 Requirements
Java 17+ (Project is set to Java 22 in pom.xml)
Maven 3.9+
Internet connection (for Maven dependency download)
Optional: Postman or curl for API testing
📂 Project Structure
TaskManager/ │── pom.xml └── src/ └── main/ └── java/ └── com/example/taskmanager/ ├── controller/TaskController.java ├── model/Task.java └── service/TaskService.java



## Getting Started

### Clone the repository

Clone the project repository to your local machine:

bash
git clone https://github.com/your-username/task-manager.git
cd task-manager


### Build the project

If you are using *Maven*:

bash
mvn clean install


If you're using *Gradle*:

bash
./gradlew build


### Running the Application

To run the application, use the following command:

bash
mvn spring-boot:run


Or, if you're using *Gradle*:

bash
./gradlew bootRun


### Accessing the Application

By default, the application will start on http://localhost:8080.

You can interact with the API via endpoints (if you're building a REST API):

* GET /api/tasks — List all tasks.
* POST /api/tasks — Add a new task.
* PUT /api/tasks/{id} — Update a task.
* DELETE /api/tasks/{id} — Delete a task.

If you’re using a UI, navigate to http://localhost:8080 to access the application


📌 API Endpoints

Create Task

POST /tasks

{ "title": "Learn Spring", "description": "Build REST API", "deadline": "2025-08-20", "priority": "High", "status": "Pending" }

Get All Tasks

GET /tasks

Get Task by ID

GET /tasks/{id}

Update Task

PUT /tasks/{id}

{ "title": "Learn Spring Boot", "description": "REST + Swagger", "deadline": "2025-08-25", "priority": "Medium", "status": "Completed" }

Delete Task

DELETE /tasks/{id}

🛠 Test with cURL

Create
curl -X POST http://localhost:8080/tasks
-H "Content-Type: application/json"
-d '{"title":"Learn Spring","description":"Build REST API","deadline":"2025-08-20","priority":"High","status":"Pending"}'

Get all
curl http://localhost:8080/tasks

Get by ID
curl http://localhost:8080/tasks/1

Update
curl -X PUT http://localhost:8080/tasks/1
-H "Content-Type: application/json"
-d '{"title":"Learn Spring Boot","description":"REST + Swagger","deadline":"2025-08-25","priority":"Medium","status":"Completed"}'

Delete
curl -X DELETE http://localhost:8080/tasks/1
