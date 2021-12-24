package com.patterns.behavioral.visitor.entity;

import com.patterns.behavioral.visitor.entity.visitor.AnimeVisitor;

public class AnimeFilm extends Anime {

    private final float duration;

    public AnimeFilm(String title, float duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void accept(AnimeVisitor visitor) {
        visitor.visit(this);
    }

    public float getDuration() {
        return duration;
    }
}
