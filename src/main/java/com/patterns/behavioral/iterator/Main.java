package com.patterns.behavioral.iterator;

import com.patterns.behavioral.iterator.entity.Manga;
import com.patterns.behavioral.iterator.library.Library;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        for(Manga m : library) {
            out.println(m.getTitle());
        }
    }
}
