package io.zipcoder.designpatterns.factory;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class BeerMachine extends DrinkDispenser {
    @Override
    public Drink dispense() {
        return new Beer();
    }
}
