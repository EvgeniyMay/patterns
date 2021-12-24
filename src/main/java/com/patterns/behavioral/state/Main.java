package com.patterns.behavioral.state;

import com.patterns.behavioral.state.entity.Manga;
import com.patterns.behavioral.state.entity.MangaProcess;
import com.patterns.behavioral.state.state.impl.MangaProjecting;

public class Main {

    private static final String MANGA_TITLE = "Title";

    public static void main(String[] args) {
        Manga manga = new Manga(MANGA_TITLE);
        MangaProcess process = new MangaProcess(manga, new MangaProjecting());

        for(int i=0; i<10; ++i) {
            process.process();
        }
    }
}
