package com.patterns.behavioral.memento;

import com.patterns.behavioral.memento.caretaker.PageEditHistory;
import com.patterns.behavioral.memento.entity.EditablePage;

public class Main {

    public static void main(String[] args) {
        PageEditHistory editHistory = new PageEditHistory();
        EditablePage page = new EditablePage(0);

        page.writeLine("Long time ago there was one boy.");
        page.writeLine("And his name was Eugen.");
        editHistory.savePage(page.save());
        System.out.println(page);

        page.removeLastLine();
        page.writeLine("And his name was Yevhenii.");
        System.out.println(page);

        page.loadState(editHistory.getLastSave());
        System.out.println(page);

    }
}
