package org.annotations.customannotation.beginnerlevel.pendingtasklist;
public class TaskService {

    @Todo(task = "Implement login feature", assignedTo = "John")
    public void login() {}

    @Todo(task = "Create user profile page", assignedTo = "Alice", priority = "HIGH")
    public void createProfile() {}

    @Todo(task = "Implement logout feature", assignedTo = "John", priority = "LOW")
    public void logout() {}
}

