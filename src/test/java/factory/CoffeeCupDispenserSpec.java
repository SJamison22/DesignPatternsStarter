package factory;

import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class CoffeeCupDispenserSpec {

    CoffeeCupDispenser coffeeCupDispenser = new CoffeeCupDispenser();

    @Before
    public void init(){
        coffeeCupDispenser = new CoffeeCupDispenser();
    }

    @Test
    public void drinkDispenserTestSuper(){
        Class expected = new CoffeeCupDispenser().getClass().getSuperclass();
        Class actual = coffeeCupDispenser.getClass().getSuperclass();
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new CoffeeCupDispenser().getClass();
        Class actual = coffeeCupDispenser.getClass();
        assertEquals(expected,actual);
    }
}
