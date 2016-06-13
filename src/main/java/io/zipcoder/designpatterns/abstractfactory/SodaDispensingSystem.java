package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import io.zipcoder.designpatterns.factory.SodaMachine;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class SodaDispensingSystem {
    public DrinkDispenser drinkDispenser(){
        return new SodaMachine();
    }

    public CupDispenser cupDispenser(){
        return new SodaCupDispenser();
    }
}
