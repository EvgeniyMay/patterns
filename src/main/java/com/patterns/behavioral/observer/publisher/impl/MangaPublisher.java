package com.patterns.behavioral.observer.publisher.impl;

import com.patterns.behavioral.observer.entity.Manga;
import com.patterns.behavioral.observer.publisher.Publisher;

public class MangaPublisher implements Publisher {

    private static final float MIN_RATE_TO_PUBLISH = 7;

    @Override
    public void update(Manga manga) {
        if(manga.getRating() >= MIN_RATE_TO_PUBLISH) {
            System.out.println("We print manga " + manga.getTitle());
        }
    }
}
