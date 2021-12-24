package com.patterns.behavioral.chain.handler.impl;

import com.patterns.behavioral.chain.entity.Task;
import com.patterns.behavioral.chain.entity.Task.TaskLevel;

public class JuniorHandler extends AbstractTaskHandler {

    public JuniorHandler() {
        handlerLevel = TaskLevel.Easy;
    }

    @Override
    protected void handleSuitableTask(Task task) {
        print("Junior resolving " + task.getTaskLevel() + " task");
    }
}
