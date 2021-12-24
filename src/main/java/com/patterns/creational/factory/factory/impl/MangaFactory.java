package com.patterns.creational.factory.factory.impl;

import com.patterns.creational.factory.entity.Book;
import com.patterns.creational.factory.entity.Manga;
import com.patterns.creational.factory.factory.BookFactory;

public class MangaFactory implements BookFactory {

    @Override
    public Book createBook(String title) {
        return new Manga(title);
    }
}
