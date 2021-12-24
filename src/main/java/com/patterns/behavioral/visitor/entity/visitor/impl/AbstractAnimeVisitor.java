package com.patterns.behavioral.visitor.entity.visitor.impl;

import com.patterns.behavioral.visitor.entity.Anime;
import com.patterns.behavioral.visitor.entity.AnimeFilm;
import com.patterns.behavioral.visitor.entity.AnimeSerial;
import com.patterns.behavioral.visitor.entity.visitor.AnimeVisitor;

public abstract class AbstractAnimeVisitor implements AnimeVisitor {

    @Override
    public void visit(Anime anime) {
        if(anime instanceof AnimeFilm) {
            visit((AnimeFilm)anime);
        }
        if(anime instanceof AnimeSerial) {
            visit((AnimeSerial)anime);
        }
    }

    protected abstract void visit(AnimeFilm film);

    protected abstract void visit(AnimeSerial serial);

    protected void print(String str) {
        System.out.println(str);
    }
}
