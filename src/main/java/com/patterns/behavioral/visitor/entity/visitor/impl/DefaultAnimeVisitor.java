package com.patterns.behavioral.visitor.entity.visitor.impl;

import com.patterns.behavioral.visitor.entity.AnimeFilm;
import com.patterns.behavioral.visitor.entity.AnimeSerial;

public class DefaultAnimeVisitor extends AbstractAnimeVisitor {

    @Override
    public void visit(AnimeFilm film) {
        String filmInfo = "AnimeFilm{" +
                "title='" + film.getTitle() + "', " +
                "duration=" + film.getDuration() +
                '}';
        print(filmInfo);
    }

    @Override
    public void visit(AnimeSerial serial) {
        String serialInfo = "AnimeSerial{" +
                "title='" + serial.getTitle() + "', " +
                "episodeCount=" + serial.getEpisodeCount() +
                '}';
        print(serialInfo);
    }
}
