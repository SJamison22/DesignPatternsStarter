package factory;

import io.zipcoder.designpatterns.factory.BeerGlass;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class BeerGlassSpec {

    BeerGlass beerGlass = new BeerGlass();

    @Before
    public void init(){
        beerGlass = new BeerGlass();
    }

    @Test
    public void drinkDispenserTestInterface(){
        Class expected = new BeerGlass().getClass().getInterfaces()[0];
        Class actual = beerGlass.getClass().getInterfaces()[0];
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new BeerGlass().getClass();
        Class actual = beerGlass.getClass();
        assertEquals(expected,actual);
    }

}
