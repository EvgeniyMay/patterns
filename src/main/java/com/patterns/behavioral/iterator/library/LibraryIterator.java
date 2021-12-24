package com.patterns.behavioral.iterator.library;

import com.patterns.behavioral.iterator.entity.Manga;

import java.util.Iterator;
import java.util.List;

public class LibraryIterator implements Iterator<Manga> {

    private int curPos;

    private final List<Manga> mangaList;

    public LibraryIterator(List<Manga> mangaList) {
        this.mangaList = mangaList;
        this.curPos = 0;
    }

    @Override
    public boolean hasNext() {
        return curPos < mangaList.size();
    }

    @Override
    public Manga next() {
        return mangaList.get(curPos++);
    }
}
