package factory;

import io.zipcoder.designpatterns.factory.BeerGlass;
import io.zipcoder.designpatterns.factory.CoffeeCup;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class CoffeeCupSpec {

        CoffeeCup coffeeCup = new CoffeeCup();

        @Before
        public void init(){
            coffeeCup = new CoffeeCup();
        }

        @Test
        public void drinkDispenserTestInterface(){
            Class expected = new CoffeeCup().getClass().getInterfaces()[0];
            Class actual = coffeeCup.getClass().getInterfaces()[0];
            assertEquals(expected,actual);
        }

        @Test
        public void drinkDispenserTestClass(){
            Class expected = new CoffeeCup().getClass();
            Class actual = coffeeCup.getClass();
            assertEquals(expected,actual);
        }

}
