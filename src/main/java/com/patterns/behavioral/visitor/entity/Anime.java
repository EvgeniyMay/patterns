package com.patterns.behavioral.visitor.entity;

import com.patterns.behavioral.visitor.entity.contract.Visitable;

public abstract class Anime implements Visitable {

    private final String title;

    public Anime(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
