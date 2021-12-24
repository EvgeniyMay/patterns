package com.patterns.behavioral.visitor.entity.visitor;

import com.patterns.behavioral.visitor.entity.Anime;

public interface AnimeVisitor {

    void visit(Anime film);
}
