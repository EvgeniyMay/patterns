package com.patterns.behavioral.chain.handler;

import com.patterns.behavioral.chain.entity.Task;

public interface TaskHandler {

    void setSuccessor(TaskHandler handler);

    void handle(Task task);
}
