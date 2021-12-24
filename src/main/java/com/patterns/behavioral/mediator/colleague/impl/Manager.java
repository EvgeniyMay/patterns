package com.patterns.behavioral.mediator.colleague.impl;

import com.patterns.behavioral.mediator.mediator.Mediator;
import com.patterns.behavioral.mediator.mediator.impl.MangaMediator;

public class Manager extends AbstractColleague {

    public Manager(MangaMediator mediator) {
        super(mediator);
        mediator.setManager(this);
    }

    public Manager(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        print("Manager received message: " + message);
    }
}