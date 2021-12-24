package com.patterns.behavioral.memento.caretaker;

import com.patterns.behavioral.memento.entity.PageMemento;

import java.util.LinkedList;
import java.util.Queue;

public class PageEditHistory {

    private final Queue<PageMemento> savePoints;

    public PageEditHistory() {
        this.savePoints = new LinkedList<>();
    }

    public void savePage(PageMemento pageMemento) {
        savePoints.add(pageMemento);
    }

    public PageMemento getLastSave() {
        return savePoints.peek();
    }
}
