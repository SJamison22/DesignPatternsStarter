package factory;
import io.zipcoder.designpatterns.factory.Coffee;
import io.zipcoder.designpatterns.factory.CoffeeMachine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class CoffeeMachineSpec {

    CoffeeMachine coffeeMachine = new CoffeeMachine();

    @Before
    public void init(){
        coffeeMachine = new CoffeeMachine();
    }

    @Test
    public void dispenseTest(){
        Class expected = new Coffee().getClass();
        Class actual = coffeeMachine.dispense().getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new CoffeeMachine().getClass().getSuperclass();
        Class actual = coffeeMachine.getClass().getSuperclass();
        assertEquals(expected,actual);
    }


}
