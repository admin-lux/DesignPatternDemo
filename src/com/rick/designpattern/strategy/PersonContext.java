package com.rick.designpattern.strategy;

/**
 * Created by MyPC on 2017/6/1.
 */
public class PersonContext {
    private TravelStrategy mTravelStrategy;

    public PersonContext(TravelStrategy mTravelStrategy) {
        this.mTravelStrategy = mTravelStrategy;
    }

    public void travel() {
        mTravelStrategy.travel();
    }
}
