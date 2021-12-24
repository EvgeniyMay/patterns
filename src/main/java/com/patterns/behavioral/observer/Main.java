package com.patterns.behavioral.observer;

import com.patterns.behavioral.observer.entity.Manga;
import com.patterns.behavioral.observer.mangaka.Mangaka;
import com.patterns.behavioral.observer.mangaka.impl.Dodzinsi;
import com.patterns.behavioral.observer.publisher.Publisher;
import com.patterns.behavioral.observer.publisher.impl.AnimePublisher;
import com.patterns.behavioral.observer.publisher.impl.MangaPublisher;

public class Main {

    public static void main(String[] args) {
        Mangaka mangaka = new Dodzinsi("Name");

        Manga goodManga = new Manga("GoodManga", mangaka, 8);
        Manga superManga = new Manga("SuperManga", mangaka, 9);

        Publisher mangaPublisher = new MangaPublisher();
        Publisher animePublisher = new AnimePublisher();

        mangaka.addObserver(mangaPublisher);
        mangaka.addObserver(animePublisher);

        mangaka.notifyObservers(goodManga);
        mangaka.notifyObservers(superManga);
    }
}
