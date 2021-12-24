package com.patterns.behavioral.command.entity;

public class Manga {

    private final String title;
    private final Mangaka author;

    public Manga(String title, Mangaka author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Mangaka getAuthor() {
        return author;
    }
}
