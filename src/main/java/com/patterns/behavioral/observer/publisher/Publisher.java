package com.patterns.behavioral.observer.publisher;

import com.patterns.behavioral.observer.entity.Manga;

public interface Publisher {

    void update(Manga manga);
}
