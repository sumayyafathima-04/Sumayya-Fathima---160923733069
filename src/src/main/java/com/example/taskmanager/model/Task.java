package com.example.taskmanager.model;

    public class Task {
        private int id;
        private String title;
        private String description;
        private String deadline;
        private String priority;
        private String status;

        public Task() { }

        public Task(int id, String title, String description, String deadline, String priority, String status) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.deadline = deadline;
            this.priority = priority;
            this.status = status;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public String getDeadline() { return deadline; }
        public void setDeadline(String deadline) { this.deadline = deadline; }

        public String getPriority() { return priority; }
        public void setPriority(String priority) { this.priority = priority; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
    }

