package com.patterns.behavioral.command.command.impl;

import com.patterns.behavioral.command.command.MangaCommand;
import com.patterns.behavioral.command.entity.Manga;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMangaCommand implements MangaCommand {

    protected final List<Manga> mangaRepository = new ArrayList<>();

}
