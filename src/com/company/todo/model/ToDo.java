package com.company.todo.model;

public class ToDo {
    private Integer id;
    private String description;
    private boolean isDone;

    public ToDo(Integer id, String description, boolean isDone) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
    }

    public ToDo(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        String status = this.isDone ? "DONE" : "TODO";
        return String.format("Task #%s (%s): %s", this.id, status, this.description );
    }
}
