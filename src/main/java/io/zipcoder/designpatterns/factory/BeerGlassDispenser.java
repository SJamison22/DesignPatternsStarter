package io.zipcoder.designpatterns.factory;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class BeerGlassDispenser extends CupDispenser{
    @Override
    public Cup dispense() {
        return new BeerGlass();
    }
}
