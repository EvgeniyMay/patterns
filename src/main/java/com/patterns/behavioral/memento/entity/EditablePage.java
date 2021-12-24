package com.patterns.behavioral.memento.entity;

import java.util.ArrayList;
import java.util.List;

public class EditablePage {

    private int pageNumber;
    private List<String> lines;

    public EditablePage(int pageNumber) {
        this.pageNumber = pageNumber;
        this.lines = new ArrayList<>();
    }

    public void writeLine(String line) {
        lines.add(line);
    }

    public void removeLastLine() {
        lines.remove(lines.size() - 1);
    }

    public PageMemento save() {
        return new PageMemento(pageNumber, lines);
    }

    public void loadState(PageMemento savePoint) {
        this.pageNumber = savePoint.getPageNumber();
        this.lines = new ArrayList<>(savePoint.getLines());
    }

    @Override
    public String toString() {
        return "EditablePage{" +
                "pageNumber=" + pageNumber +
                ", lines=" + lines +
                '}';
    }
}
