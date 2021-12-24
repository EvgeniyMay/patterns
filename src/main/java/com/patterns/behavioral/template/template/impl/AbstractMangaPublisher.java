package com.patterns.behavioral.template.template.impl;

import com.patterns.behavioral.template.entity.Manga;
import com.patterns.behavioral.template.template.MangaPublisher;

import static java.lang.System.out;

public abstract class AbstractMangaPublisher implements MangaPublisher {

    @Override
    public final void publish(Manga manga) {
        makeCalculation();
        takeMoney();
        startPublishing(manga);
    }

    protected void makeCalculation() {
        out.println("Making calculations...");
    }

    protected void takeMoney() {
        out.println("Taking money...");
    }

    protected abstract void startPublishing(Manga manga);
}
