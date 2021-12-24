package com.patterns.behavioral.visitor.entity.visitor.impl;

import com.patterns.behavioral.visitor.entity.AnimeFilm;
import com.patterns.behavioral.visitor.entity.AnimeSerial;

import static java.lang.System.*;

public class HtmlAnimeVisitor extends AbstractAnimeVisitor {

    @Override
    public void visit(AnimeFilm film) {
        String filmHtml = "<div class='film'>" + lineSeparator() +
                "\t<h1>" + film.getTitle() + "</h1>" + lineSeparator() +
                "\t<p>Duration: " + film.getDuration() + "</p>" + lineSeparator() +
                "</div>";
        print(filmHtml);
    }

    @Override
    public void visit(AnimeSerial serial) {
        String serialHtml = "<div class='serial'>" + lineSeparator() +
                "\t<h1>" + serial.getTitle() + "</h1>" + lineSeparator() +
                "\t<p>Episode count: " + serial.getEpisodeCount() + "</p>" + lineSeparator() +
                "</div>";
        print(serialHtml);
    }
}
