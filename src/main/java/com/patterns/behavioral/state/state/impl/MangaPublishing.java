package com.patterns.behavioral.state.state.impl;

import com.patterns.behavioral.state.entity.MangaProcess;

public class MangaPublishing extends AbstractMangaProcessState {

    @Override
    public void process(MangaProcess process) {
        print("Publishing manga " + process.getManga().getTitle());
    }
}
