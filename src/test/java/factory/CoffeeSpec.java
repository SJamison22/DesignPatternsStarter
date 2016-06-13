package factory;

import io.zipcoder.designpatterns.factory.Coffee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class CoffeeSpec {

    Coffee coffee;

    @Before
    public void init(){
        coffee = new Coffee();
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new Coffee().getClass();
        Class actual = coffee.getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestInterface(){
        Class expected = new Coffee().getClass().getInterfaces()[0];
        Class actual = coffee.getClass().getInterfaces()[0];
        assertEquals(expected,actual);
    }
}
