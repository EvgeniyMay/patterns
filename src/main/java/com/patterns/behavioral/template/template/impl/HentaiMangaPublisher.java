package com.patterns.behavioral.template.template.impl;

import com.patterns.behavioral.template.entity.Manga;

public class HentaiMangaPublisher extends AbstractMangaPublisher {

    @Override
    protected void startPublishing(Manga manga) {
        System.out.println("Publishing hentai manga " + manga.getTitle());
    }
}
