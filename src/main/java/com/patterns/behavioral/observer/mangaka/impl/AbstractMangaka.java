package com.patterns.behavioral.observer.mangaka.impl;

import com.patterns.behavioral.observer.entity.Manga;
import com.patterns.behavioral.observer.mangaka.Mangaka;
import com.patterns.behavioral.observer.publisher.Publisher;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMangaka implements Mangaka {

    private String name;

    private Set<Publisher> publishers;

    protected AbstractMangaka(String name) {
        this.name = name;
        publishers = new HashSet<>();
    }

    @Override
    public void addObserver(Publisher publisher) {
        publishers.add(publisher);
    }

    @Override
    public void removeObserver(Publisher publisher) {
        publishers.remove(publisher);
    }

    @Override
    public void notifyObservers(Manga manga) {
        publishers.forEach(p -> p.update(manga));
    }
}
