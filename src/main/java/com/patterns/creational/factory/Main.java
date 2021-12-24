package com.patterns.creational.factory;

import com.patterns.creational.factory.entity.Book;
import com.patterns.creational.factory.factory.BookFactory;
import com.patterns.creational.factory.factory.impl.DefaultBookFactory;
import com.patterns.creational.factory.factory.impl.MangaFactory;

public class Main {

    public static void main(String... args) {

        BookFactory bookFactory = new DefaultBookFactory();
        MangaFactory mangaFactory = new MangaFactory();

        Book manga = mangaFactory.createBook("Manga title");
        Book book = bookFactory.createBook("Book title");

        System.out.println(manga.getTitle() + "\n" + book.getTitle());
    }
}
