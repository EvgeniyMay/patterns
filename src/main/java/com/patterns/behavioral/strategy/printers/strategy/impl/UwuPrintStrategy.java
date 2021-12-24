package com.patterns.behavioral.strategy.printers.strategy.impl;

import com.patterns.behavioral.strategy.printers.strategy.PrintStrategy;

public class UwuPrintStrategy implements PrintStrategy {

    private static final String UWU_SUFFIX = " UwU";

    @Override
    public void print(String text) {
        System.out.println(text + UWU_SUFFIX);
    }
}
