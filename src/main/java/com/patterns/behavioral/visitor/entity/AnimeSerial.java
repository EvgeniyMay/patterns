package com.patterns.behavioral.visitor.entity;

import com.patterns.behavioral.visitor.entity.visitor.AnimeVisitor;

public class AnimeSerial extends Anime {

    private final int episodeCount;

    public AnimeSerial(String title, int episodeCount) {
        super(title);
        this.episodeCount = episodeCount;
    }

    @Override
    public void accept(AnimeVisitor visitor) {
        visitor.visit(this);
    }

    public int getEpisodeCount() {
        return episodeCount;
    }
}
