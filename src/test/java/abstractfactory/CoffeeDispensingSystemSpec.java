package abstractfactory;

import io.zipcoder.designpatterns.abstractfactory.CoffeeDispensingSystem;
import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import io.zipcoder.designpatterns.factory.CoffeeMachine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class CoffeeDispensingSystemSpec {

    CoffeeDispensingSystem coffeeDispensingSystem;

    @Before
    public void init(){
        coffeeDispensingSystem = new CoffeeDispensingSystem();
    }

    @Test
    public void drinkDispenserTest(){
        Class expected = new CoffeeMachine().getClass();
        Class actual = coffeeDispensingSystem.drinkDispenser().getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void cupDispenserTest(){
        Class expected = new CoffeeCupDispenser().getClass();
        Class actual = coffeeDispensingSystem.cupDispenser().getClass();
        assertEquals(expected,actual);
    }
}
