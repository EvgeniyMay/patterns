package com.patterns.behavioral.template.template.impl;

import com.patterns.behavioral.template.entity.Manga;

public class DefaultMangaPublisher extends AbstractMangaPublisher {

    @Override
    protected void startPublishing(Manga manga) {
        System.out.println("Start publishing manga " + manga.getTitle());
    }
}
