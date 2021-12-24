package com.patterns.behavioral.command.command.impl;

import com.patterns.behavioral.command.entity.Manga;

public class PublishMangaCommand extends AbstractMangaCommand {

    private final Manga manga;

    public PublishMangaCommand(Manga manga) {
        this.manga = manga;
    }

    @Override
    public void execute() {
        System.out.println("NEWS: Manga " + manga.getTitle() + " is published!");
    }
}
