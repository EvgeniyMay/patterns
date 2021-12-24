package com.patterns.behavioral.mediator;

import com.patterns.behavioral.mediator.colleague.Colleague;
import com.patterns.behavioral.mediator.colleague.impl.Manager;
import com.patterns.behavioral.mediator.colleague.impl.Mangaka;
import com.patterns.behavioral.mediator.colleague.impl.Publisher;
import com.patterns.behavioral.mediator.mediator.impl.MangaMediator;

public class Main {

    public static void main(String[] args) {
        MangaMediator mediator = new MangaMediator();
        Colleague mangaka = new Mangaka(mediator);
        Colleague manager = new Manager(mediator);
        Colleague publisher = new Publisher(mediator);

        mangaka.send("I finished Manga!");
        manager.send("We rated Manga!");
        publisher.send("We published Manga!");
    }
}
