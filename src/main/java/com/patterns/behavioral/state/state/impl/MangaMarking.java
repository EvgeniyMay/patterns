package com.patterns.behavioral.state.state.impl;

import com.patterns.behavioral.state.entity.MangaProcess;

import java.util.Random;

public class MangaMarking extends AbstractMangaProcessState {

    public MangaMarking() {
        this.nextStateClass = MangaPublishing.class;
        this.prevStateClass = MangaWriting.class;
    }

    @Override
    public void process(MangaProcess process) {
        print("Marking manga " + process.getManga().getTitle());

        if(new Random().nextBoolean()) {
            updateNextProcessState(process);
        } else {
            updatePrevProcessState(process);
        }
    }
}
