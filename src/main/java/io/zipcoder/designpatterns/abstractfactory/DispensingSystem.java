package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
//import io.zipcoder.designpatterns.factory.CupDispenser;

public abstract class DispensingSystem{
    public abstract DrinkDispenser drinkDispenser();

    public abstract CupDispenser cupDispenser();

}