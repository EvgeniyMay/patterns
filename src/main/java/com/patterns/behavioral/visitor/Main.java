package com.patterns.behavioral.visitor;

import com.patterns.behavioral.visitor.entity.Anime;
import com.patterns.behavioral.visitor.entity.AnimeFilm;
import com.patterns.behavioral.visitor.entity.AnimeSerial;
import com.patterns.behavioral.visitor.entity.visitor.AnimeVisitor;
import com.patterns.behavioral.visitor.entity.visitor.impl.DefaultAnimeVisitor;
import com.patterns.behavioral.visitor.entity.visitor.impl.HtmlAnimeVisitor;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        List<Anime> animeList = asList(
                new AnimeFilm( "Your name", 120),
                new AnimeSerial("Angel Beats", 13),
                new AnimeSerial("Evangelion", 12));
        AnimeVisitor visitor = new DefaultAnimeVisitor();
        animeList.forEach(visitor::visit);

        AnimeVisitor htmlVisitor = new HtmlAnimeVisitor();
        animeList.forEach(htmlVisitor::visit);
    }
}
