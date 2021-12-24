package com.patterns.behavioral.chain.handler.impl;

import com.patterns.behavioral.chain.entity.Task;
import com.patterns.behavioral.chain.entity.Task.TaskLevel;

public class MiddleHandler extends AbstractTaskHandler {

    public MiddleHandler() {
        handlerLevel = TaskLevel.Middle;
    }

    @Override
    protected void handleSuitableTask(Task task) {
        print("Middle resolving " + task.getTaskLevel() + " task");
    }
}
