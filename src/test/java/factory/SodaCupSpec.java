package factory;

import io.zipcoder.designpatterns.factory.SodaCup;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class SodaCupSpec {

    SodaCup sodaCup = new SodaCup();

    @Before
    public void init(){
        sodaCup = new SodaCup();
    }

    @Test
    public void drinkDispenserTestInterface(){
        Class expected = new SodaCup().getClass().getInterfaces()[0];
        Class actual = sodaCup.getClass().getInterfaces()[0];
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new SodaCup().getClass();
        Class actual = sodaCup.getClass();
        assertEquals(expected,actual);
    }
}
