package com.patterns.creational.factory.impl;

import com.patterns.creational.abstractFactory.entity.Archer;
import com.patterns.creational.abstractFactory.entity.Knight;
import com.patterns.creational.abstractFactory.entity.elf.ElfArcher;
import com.patterns.creational.abstractFactory.entity.elf.ElfKnight;
import com.patterns.creational.factory.WarriorFactory;

public class ElfFactory implements WarriorFactory {

    @Override
    public Knight createKnight(String name) {
        return new ElfKnight(name);
    }

    @Override
    public Archer createArcher(String name) {
        return new ElfArcher(name);
    }
}
