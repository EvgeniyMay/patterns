package com.patterns.behavioral.chain;

import com.patterns.behavioral.chain.entity.Task;
import com.patterns.behavioral.chain.handler.TaskHandler;
import com.patterns.behavioral.chain.handler.impl.JuniorHandler;
import com.patterns.behavioral.chain.handler.impl.MiddleHandler;
import com.patterns.behavioral.chain.handler.impl.SeniorHandler;

import java.util.List;

import static com.patterns.behavioral.chain.entity.Task.TaskLevel.*;
import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        TaskHandler seniorHandler = new SeniorHandler();
        TaskHandler middleHandler = new MiddleHandler();
        TaskHandler juniorHandler = new JuniorHandler();
        seniorHandler.setSuccessor(middleHandler);
        middleHandler.setSuccessor(juniorHandler);

        List<Task> tasks = asList(new Task(Hard), new Task(Middle), new Task(Easy));

        tasks.forEach(seniorHandler::handle);
    }
}
