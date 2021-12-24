package com.patterns.behavioral.command.command.impl;

import com.patterns.behavioral.command.entity.Manga;
import com.patterns.behavioral.command.entity.Mangaka;

public class CreateMangaCommand extends AbstractMangaCommand {

    private final String mangaTitle;
    private final Mangaka mangaAuthor;

    public CreateMangaCommand(String mangaTitle, Mangaka mangaAuthor) {
        this.mangaTitle = mangaTitle;
        this.mangaAuthor = mangaAuthor;
    }

    @Override
    public void execute() {
        Manga manga = new Manga(mangaTitle, mangaAuthor);
        System.out.println("NEWS: Created " + manga.getTitle() + " manga!");
        mangaRepository.add(manga);
    }
}
