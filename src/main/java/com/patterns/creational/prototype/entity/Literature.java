package com.patterns.creational.prototype.entity;

public abstract class Literature {

    private String title;

    private int pages;

    public Literature() { }
    public Literature(Literature target){
        if(target != null) {
            this.title = target.title;
            this.pages = target.pages;
        }
    }

    public Literature(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public abstract Literature clone();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
