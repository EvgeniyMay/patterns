package com.patterns.creational.prototype.entity;

public class Renobe extends Literature {

    private int recommendedAge;

    public Renobe() {
        super();
    }
    public Renobe(Renobe target) {
        super(target);
        if(target != null) {
            this.recommendedAge = target.recommendedAge;
        }
    }

    @Override
    public Literature clone() {
        return new Renobe(this);
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }
}
