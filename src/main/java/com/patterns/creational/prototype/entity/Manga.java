package com.patterns.creational.prototype.entity;

public class Manga extends Literature {

    private int picturesCount;

    public Manga() {
        super();
    }
    public Manga(Manga target) {
        super(target);
        if(target != null) {
            this.picturesCount = target.picturesCount;
        }
    }

    @Override
    public Manga clone(){
        return new Manga(this);
    }

    public int getPicturesCount() {
        return picturesCount;
    }

    public void setPicturesCount(int picturesCount) {
        this.picturesCount = picturesCount;
    }
}
