package com.patterns.creational.factory;

import com.patterns.creational.abstractFactory.entity.Archer;
import com.patterns.creational.abstractFactory.entity.Knight;

public interface WarriorFactory {

    Knight createKnight(String name);

    Archer createArcher(String name);
}
