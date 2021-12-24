package com.patterns.behavioral.observer.publisher.impl;

import com.patterns.behavioral.observer.entity.Manga;
import com.patterns.behavioral.observer.publisher.Publisher;

public class AnimePublisher implements Publisher {

    private static final float MIN_RATE_TO_PUBLISH = 8.5f;

    @Override
    public void update(Manga manga) {
        if(manga.getRating() >= MIN_RATE_TO_PUBLISH) {
            System.out.println("We make anime " + manga.getTitle());
        }
    }
}
