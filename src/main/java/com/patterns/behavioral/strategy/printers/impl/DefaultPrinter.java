package com.patterns.behavioral.strategy.printers.impl;

import com.patterns.behavioral.strategy.printers.Printer;
import com.patterns.behavioral.strategy.printers.strategy.PrintStrategy;
import com.patterns.behavioral.strategy.printers.strategy.impl.DefaultPrintStrategy;
import com.patterns.behavioral.strategy.printers.strategy.impl.UwuPrintStrategy;

public class DefaultPrinter implements Printer {

    private static final int MAX_UWU_LENGTH = 7;

    private final PrintStrategy defaultPrintStrategy;
    private final PrintStrategy uwuPrintStrategy;

    public DefaultPrinter() {
        this.defaultPrintStrategy = new DefaultPrintStrategy();
        this.uwuPrintStrategy = new UwuPrintStrategy();
    }

    @Override
    public void print(String text) {
        if(isUwuText(text)) {
            uwuPrintStrategy.print(text);
        } else {
            defaultPrintStrategy.print(text);
        }
    }

    private boolean isUwuText(String text) {
        return text.length() <= MAX_UWU_LENGTH;
    }
}
