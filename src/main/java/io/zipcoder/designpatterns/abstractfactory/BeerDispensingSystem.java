package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.BeerMachine;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class BeerDispensingSystem {
    public DrinkDispenser drinkDispenser(){
        return new BeerMachine();
    }

    public CupDispenser cupDispenser(){
        return  new BeerGlassDispenser();
    }
}
