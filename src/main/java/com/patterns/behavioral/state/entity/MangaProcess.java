package com.patterns.behavioral.state.entity;

import com.patterns.behavioral.state.state.MangaProcessState;

public class MangaProcess {

    private final Manga manga;
    private MangaProcessState state;

    public MangaProcess(Manga manga, MangaProcessState state) {
        this.manga = manga;
        this.state = state;
    }

    public void process() {
        state.process(this);
    }

    public Manga getManga() {
        return manga;
    }

    public MangaProcessState getState() {
        return state;
    }

    public void setState(MangaProcessState state) {
        this.state = state;
    }
}
