package com.patterns.behavioral.observer.entity;

import com.patterns.behavioral.observer.mangaka.Mangaka;

public class Manga {

    private String title;
    private Mangaka Author;
    private float rating;

    public Manga(String title, Mangaka author, float rating) {
        this.title = title;
        Author = author;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public Mangaka getAuthor() {
        return Author;
    }

    public float getRating() {
        return rating;
    }
}
