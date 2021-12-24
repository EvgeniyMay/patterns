package com.patterns.behavioral.visitor.entity.contract;

import com.patterns.behavioral.visitor.entity.visitor.AnimeVisitor;

public interface Visitable {

    void accept(AnimeVisitor visitor);

}
