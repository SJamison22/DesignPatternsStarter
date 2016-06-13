package factory;

import io.zipcoder.designpatterns.factory.Soda;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by stevejaminson on 6/13/16.
 */
public class SodaSpec {

    Soda soda;

    @Before
    public void init(){
        soda = new Soda();
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new Soda().getClass();
        Class actual = soda.getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestInterface(){
        Class expected = new Soda().getClass().getInterfaces()[0];
        Class actual = soda.getClass().getInterfaces()[0];
        assertEquals(expected,actual);
    }
}
