package com.patterns.behavioral.strategy;

import com.patterns.behavioral.strategy.printers.Printer;
import com.patterns.behavioral.strategy.printers.impl.DefaultPrinter;

public class Main {

    private static final String LONG_TEXT = "Long test text";
    private static final String SHORT_TEXT = "Text";

    public static void main (String... args) {
        Printer printer = new DefaultPrinter();

        printer.print(LONG_TEXT);

        printer.print(SHORT_TEXT);
    }
}
