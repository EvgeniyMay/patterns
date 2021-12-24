package com.patterns.behavioral.chain.entity;

public class Task {

    public enum TaskLevel {
        Hard, Middle, Easy
    }

    public Task(TaskLevel taskLevel) {
        this.taskLevel = taskLevel;
    }

    private TaskLevel taskLevel;

    public TaskLevel getTaskLevel() {
        return taskLevel;
    }

    public void setTaskLevel(TaskLevel taskLevel) {
        this.taskLevel = taskLevel;
    }
}
