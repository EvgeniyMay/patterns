package com.patterns.behavioral.state.state.impl;

import com.patterns.behavioral.state.entity.MangaProcess;

public class MangaProjecting extends AbstractMangaProcessState {

    public MangaProjecting() {
        this.nextStateClass = MangaWriting.class;
    }

    @Override
    public void process(MangaProcess process) {
        print("Projecting manga " + process.getManga().getTitle());
        updateNextProcessState(process);
    }
}
