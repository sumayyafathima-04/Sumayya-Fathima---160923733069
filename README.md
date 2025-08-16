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


