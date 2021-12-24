package com.patterns.behavioral.iterator.library;

import com.patterns.behavioral.iterator.entity.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class Library implements Iterable<Manga> {

    private final List<Manga> mangaList;

    public Library() {
        this.mangaList = new ArrayList<>(asList(
                new Manga("Manga A"),
                new Manga("Manga B"),
                new Manga("Manga C")));
    }

    @Override
    public Iterator<Manga> iterator() {
        return new LibraryIterator(mangaList);
    }
}
