package abstractfactory;

import io.zipcoder.designpatterns.abstractfactory.BeerDispensingSystem;
import io.zipcoder.designpatterns.factory.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.BeerMachine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * You can safely delete this file; it is just here so that git picks up the test/java directory structure.
 */
public class BeerDispensingSystemSpec {

    BeerDispensingSystem beerDispensingSystem;

    @Before
    public void init(){
        beerDispensingSystem = new BeerDispensingSystem();
    }

    @Test
    public void drinkDispenserTest(){
        Class expected = new BeerMachine().getClass();
        Class actual = beerDispensingSystem.drinkDispenser().getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void cupDispenserTest(){
        Class expected = new BeerGlassDispenser().getClass();
        Class actual = beerDispensingSystem.cupDispenser().getClass();
        assertEquals(expected,actual);
    }
}
