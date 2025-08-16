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
### 1. *Create a Task*

* *URL*: /api/tasks

* *Method*: POST

* *Request body*:

  json
  {
    "title": "Task Title",
    "description": "Task Description",
    "completed": false
  }
  

* *Response*:

  json
  {
    "id": 1,
    "title": "Task Title",
    "description": "Task Description",
    "completed": false
  }
  

### 2. *Get All Tasks*

* *URL*: /api/tasks
* *Method*: GET
* *Response*:

  json
  [
    {
      "id": 1,
      "title": "Task Title",
      "description": "Task Description",
      "completed": false
    }
  ]
  

### 3. *Update a Task*

* *URL*: /api/tasks/{id}

* *Method*: PUT

* *Request body*:

  json
  {
    "title": "Updated Task Title",
    "description": "Updated Description",
    "completed": true
  }
  

* *Response*:

  json
  {
    "id": 1,
    "title": "Updated Task Title",
    "description": "Updated Description",
    "completed": true
  }
  

### 4. *Delete a Task*

* *URL*: /api/tasks/{id}
* *Method*: DELETE
* *Response*: 200 OK if successful.


Task Manager (Spring Boot)
A simple REST API for managing tasks with fields like title, description, deadline, priority, and status.

📋 Requirements
Java 17+ (Project is set to Java 22 in pom.xml)
Maven 3.9+
Internet connection (for Maven dependency download)
Optional: Postman or curl for API testing
📂 Project Structure
TaskManager/ │── pom.xml └── src/ └── main/ └── java/ └── com/example/taskmanager/ ├── controller/TaskController.java ├── model/Task.java └── service/TaskService.java

🚀 How to Run
Clone the project
git clone https://github.com/your-repo/TaskManager.git
cd TaskManager
Build the project
mvn clean install

Run the application
mvn spring-boot:run

OR run TaskManagerApplication.java from your IDE.

Verify server is running
http://localhost:8080

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

About
No description, website, or topics provided.
Resources
 Readme
 Activity
Stars
 0 stars
Watchers
 0 watching
Forks
 1 fork
Report repository
Releases
No releases published
Packages
No packages published
Languages
Java
100.0%
Footer
© 2025 GitHub, Inc.
Footer navigation
Terms
Privac
