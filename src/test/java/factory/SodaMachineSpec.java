package factory;
import io.zipcoder.designpatterns.factory.Soda;
import io.zipcoder.designpatterns.factory.SodaMachine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class SodaMachineSpec {

    SodaMachine sodaMachine = new SodaMachine();

    @Before
    public void init(){
        sodaMachine = new SodaMachine();
    }

    @Test
    public void dispenseTest(){
        Class expected = new Soda().getClass();
        Class actual = sodaMachine.dispense().getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new SodaMachine().getClass().getSuperclass();
        Class actual = sodaMachine.getClass().getSuperclass();
        assertEquals(expected,actual);
    }

}
