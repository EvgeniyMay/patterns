package com.patterns.behavioral.state.state.impl;

import com.patterns.behavioral.state.entity.MangaProcess;

public class MangaWriting extends AbstractMangaProcessState {

    public MangaWriting() {
        this.nextStateClass = MangaMarking.class;
    }

    @Override
    public void process(MangaProcess process) {
        print("Writing manga " + process.getManga().getTitle());
        updateNextProcessState(process);
    }
}
