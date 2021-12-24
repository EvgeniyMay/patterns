package com.patterns.behavioral.state.state.impl;

import com.patterns.behavioral.state.entity.MangaProcess;
import com.patterns.behavioral.state.state.MangaProcessState;

public abstract class AbstractMangaProcessState implements MangaProcessState {

    protected Class nextStateClass;
    protected Class prevStateClass;

    protected void print(String str) {
        System.out.println(str);
    }

    protected void updateNextProcessState(MangaProcess process) {
        process.setState(safeNewInstance(nextStateClass));
    }

    protected void updatePrevProcessState(MangaProcess process) {
        process.setState(safeNewInstance(prevStateClass));
    }

    protected MangaProcessState safeNewInstance(Class clazz) {
        MangaProcessState state = null;
        try {
            state = (MangaProcessState)clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return state;
    }
}
