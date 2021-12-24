package com.patterns.behavioral.observer.mangaka;

import com.patterns.behavioral.observer.entity.Manga;
import com.patterns.behavioral.observer.publisher.Publisher;

public interface Mangaka {

    void addObserver(Publisher publisher);

    void removeObserver(Publisher publisher);

    void notifyObservers(Manga manga);
}

