package com.patterns.behavioral.chain.handler.impl;

import com.patterns.behavioral.chain.entity.Task;
import com.patterns.behavioral.chain.entity.Task.TaskLevel;

public class SeniorHandler extends AbstractTaskHandler {

    public SeniorHandler() {
        handlerLevel = TaskLevel.Hard;
    }

    @Override
    protected void handleSuitableTask(Task task) {
        print("Senior resolving " + task.getTaskLevel() + " task");
    }
}