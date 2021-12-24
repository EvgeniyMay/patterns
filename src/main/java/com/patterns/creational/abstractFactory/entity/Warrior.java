package com.patterns.creational.abstractFactory.entity;

public class Warrior {

    protected String name;

    public Warrior(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
