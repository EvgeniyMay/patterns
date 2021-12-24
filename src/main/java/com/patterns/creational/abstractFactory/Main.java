package com.patterns.creational.abstractFactory;

import com.patterns.creational.abstractFactory.entity.Archer;
import com.patterns.creational.factory.WarriorFactory;
import com.patterns.creational.factory.impl.ElfFactory;
import com.patterns.creational.factory.impl.HumanFactory;

public class Main {

    public static void main(String... args) {
        WarriorFactory elfFactory = new ElfFactory();
        WarriorFactory humanFactory = new HumanFactory();

        Archer elfArcher = elfFactory.createArcher("Elf-archer");
        Archer humanArcher = humanFactory.createArcher("Human-archer");

        System.out.println(elfArcher.getName() + "\n" + humanArcher.getName());
    }
}
