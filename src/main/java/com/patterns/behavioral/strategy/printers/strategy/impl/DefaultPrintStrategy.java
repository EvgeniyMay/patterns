package com.patterns.behavioral.strategy.printers.strategy.impl;

import com.patterns.behavioral.strategy.printers.strategy.PrintStrategy;

public class DefaultPrintStrategy implements PrintStrategy {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
