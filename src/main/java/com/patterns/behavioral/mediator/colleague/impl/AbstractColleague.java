package com.patterns.behavioral.mediator.colleague.impl;

import com.patterns.behavioral.mediator.colleague.Colleague;
import com.patterns.behavioral.mediator.mediator.Mediator;

public abstract class AbstractColleague implements Colleague {

    protected final Mediator mediator;

    public AbstractColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    protected void print(String str) {
        System.out.println(str);
    }
}
