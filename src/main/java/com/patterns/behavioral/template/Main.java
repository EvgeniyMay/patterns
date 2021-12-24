package com.patterns.behavioral.template;

import com.patterns.behavioral.template.entity.Manga;
import com.patterns.behavioral.template.template.MangaPublisher;
import com.patterns.behavioral.template.template.impl.DefaultMangaPublisher;
import com.patterns.behavioral.template.template.impl.HentaiMangaPublisher;

public class Main {

    private static final String MANGA_TITLE = "Manga";
    private static final String HENTAI_MANGA_TITLE = "Hentai Manga";

    public static void main(String[] args) {
        Manga manga = new Manga(MANGA_TITLE);
        Manga hentaiManga = new Manga(HENTAI_MANGA_TITLE);

        MangaPublisher mangaPublisher = new DefaultMangaPublisher();
        MangaPublisher hentaiMangaPublisher = new HentaiMangaPublisher();

        mangaPublisher.publish(manga);
        hentaiMangaPublisher.publish(hentaiManga);
    }
}
