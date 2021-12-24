package com.patterns.creational.prototype;

import com.patterns.creational.prototype.entity.Literature;
import com.patterns.creational.prototype.entity.Manga;
import com.patterns.creational.prototype.entity.Renobe;

import java.util.List;

import static java.util.Arrays.asList;
import static java.lang.System.out;

public class Main {

    public static void main(String... args) {
        Literature mangaPrototype = new Manga();
        mangaPrototype.setTitle("Manga");
        mangaPrototype.setPages(10);

        Literature renobePrototype = new Renobe();
        renobePrototype.setTitle("Renobe");
        renobePrototype.setPages(15);

        List<Literature> Literatures = asList(
                mangaPrototype.clone(), mangaPrototype.clone(), mangaPrototype.clone(),
                renobePrototype.clone(), renobePrototype.clone(), renobePrototype.clone());

        Literatures.forEach(l -> out.println(l.getTitle()));
    }
}
