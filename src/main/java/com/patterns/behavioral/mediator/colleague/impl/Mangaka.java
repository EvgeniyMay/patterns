package com.patterns.behavioral.mediator.colleague.impl;

import com.patterns.behavioral.mediator.mediator.Mediator;
import com.patterns.behavioral.mediator.mediator.impl.MangaMediator;

public class Mangaka extends AbstractColleague {

    public Mangaka(MangaMediator mediator) {
        super(mediator);
        mediator.setMangaka(this);
    }

    public Mangaka(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        print("Mangaka received message: " + message);
    }
}
