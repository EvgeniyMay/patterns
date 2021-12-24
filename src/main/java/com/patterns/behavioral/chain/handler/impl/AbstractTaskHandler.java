package com.patterns.behavioral.chain.handler.impl;

import com.patterns.behavioral.chain.entity.Task;
import com.patterns.behavioral.chain.entity.Task.TaskLevel;
import com.patterns.behavioral.chain.handler.TaskHandler;

import java.util.Objects;

import static java.util.Objects.nonNull;

public abstract class AbstractTaskHandler implements TaskHandler {

    protected TaskLevel handlerLevel;
    protected TaskHandler successor;

    @Override
    public void setSuccessor(TaskHandler handler) {
        successor = handler;
    }

    protected boolean isSuitableTask(Task task) {
        return Objects.equals(handlerLevel, task.getTaskLevel());
    }

    @Override
    public void handle(Task task) {
        if(isSuitableTask(task)) {
            handleSuitableTask(task);
        } else {
            handleUnsuitableTask(task);
        }
    }

    protected abstract void handleSuitableTask(Task task);

    protected void handleUnsuitableTask(Task task) {
        if(nonNull(successor)) {
            successor.handle(task);
        }
    }

    protected void print(String str) {
        System.out.println(str);
    }
}
