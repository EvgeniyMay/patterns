package com.patterns.creational.factory.factory;

import com.patterns.creational.factory.entity.Book;

public interface BookFactory {

    Book createBook(String title);

}
