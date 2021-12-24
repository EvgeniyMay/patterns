package com.patterns.creational.factory.impl;

import com.patterns.creational.abstractFactory.entity.Archer;
import com.patterns.creational.abstractFactory.entity.Knight;
import com.patterns.creational.abstractFactory.entity.human.HumanArcher;
import com.patterns.creational.abstractFactory.entity.human.HumanKnight;
import com.patterns.creational.factory.WarriorFactory;

public class HumanFactory implements WarriorFactory {

    @Override
    public Knight createKnight(String name) {
        return new HumanKnight(name);
    }

    @Override
    public Archer createArcher(String name) {
        return new HumanArcher(name);
    }
}
