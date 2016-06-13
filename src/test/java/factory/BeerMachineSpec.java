package factory;
import io.zipcoder.designpatterns.factory.Beer;
import io.zipcoder.designpatterns.factory.BeerMachine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class BeerMachineSpec {

    BeerMachine beerMachine = new BeerMachine();

    @Before
    public void init(){
        beerMachine = new BeerMachine();
    }

    @Test
    public void dispenseTest(){
        Class expected = new Beer().getClass();
        Class actual = beerMachine.dispense().getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new BeerMachine().getClass().getSuperclass();
        Class actual = beerMachine.getClass().getSuperclass();
        assertEquals(expected,actual);
    }

}
