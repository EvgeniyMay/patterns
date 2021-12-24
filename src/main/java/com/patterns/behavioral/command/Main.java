package com.patterns.behavioral.command;

import com.patterns.behavioral.command.command.MangaCommand;
import com.patterns.behavioral.command.command.impl.CreateMangaCommand;
import com.patterns.behavioral.command.command.impl.PublishMangaCommand;
import com.patterns.behavioral.command.entity.Manga;
import com.patterns.behavioral.command.entity.Mangaka;

public class Main {

    private static final String MANGAKA_NAME = "Name";
    private static final String MANGA_TITLE = "Title";

    public static void main(String[] args) {
        Mangaka mangaka = new Mangaka("Bill");

        MangaCommand createManga = new CreateMangaCommand(MANGA_TITLE, mangaka);
        MangaCommand publishManga = new PublishMangaCommand(new Manga(MANGA_TITLE, mangaka));

        createManga.execute();
        publishManga.execute();
    }
}
