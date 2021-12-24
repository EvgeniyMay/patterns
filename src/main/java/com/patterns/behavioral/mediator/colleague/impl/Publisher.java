package com.patterns.behavioral.mediator.colleague.impl;

import com.patterns.behavioral.mediator.mediator.Mediator;
import com.patterns.behavioral.mediator.mediator.impl.MangaMediator;

public class Publisher extends AbstractColleague {

    public Publisher(MangaMediator mediator) {
        super(mediator);
        mediator.setPublisher(this);
    }

    public Publisher(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        print("Publisher received message: " + message);
    }
}
