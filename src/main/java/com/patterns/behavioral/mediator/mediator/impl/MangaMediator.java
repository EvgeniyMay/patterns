package com.patterns.behavioral.mediator.mediator.impl;

import com.patterns.behavioral.mediator.colleague.Colleague;
import com.patterns.behavioral.mediator.mediator.Mediator;

public class MangaMediator implements Mediator {

    private Colleague mangaka;
    private Colleague manager;
    private Colleague publisher;

    @Override
    public void send(String message, Colleague sender) {
        if (mangaka.equals(sender)) {
            manager.notify(message);
        } else if (manager.equals(sender)) {
            publisher.notify(message);
        } else if (publisher.equals(sender)) {
            mangaka.notify(message);
        }
    }

    public void setMangaka(Colleague mangaka) {
        this.mangaka = mangaka;
    }

    public void setManager(Colleague manager) {
        this.manager = manager;
    }

    public void setPublisher(Colleague publisher) {
        this.publisher = publisher;
    }
}
