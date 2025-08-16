package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import org.springframework.stereotype.Service;
import java.util.*;

    @Service
    public class TaskService {
        private final Map<Integer, Task> taskDB = new HashMap<>();
        private int idCounter = 1;

        public Task createTask(Task task) {
            task.setId(idCounter++);
            taskDB.put(task.getId(), task);
            return task;
        }

        public List<Task> getAllTasks() {
            return new ArrayList<>(taskDB.values());
        }

        public Task getTaskById(int id) {
            return taskDB.get(id);
        }

        public Task updateTask(int id, Task updatedTask) {
            if (taskDB.containsKey(id)) {
                updatedTask.setId(id);
                taskDB.put(id, updatedTask);
                return updatedTask;
            }
            return null;
        }

        public boolean deleteTask(int id) {
            return taskDB.remove(id) != null;
        }
    }

