package com.patterns.behavioral.memento.entity;

import java.util.ArrayList;
import java.util.List;

public class PageMemento {

    private final int pageNumber;
    private final List<String> lines;

    public PageMemento(int pageNumber, List<String> lines) {
        this.pageNumber = pageNumber;
        this.lines = new ArrayList<>(lines);
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public List<String> getLines() {
        return lines;
    }
}
