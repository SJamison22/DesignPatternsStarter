package factory;

import io.zipcoder.designpatterns.factory.BeerGlassDispenser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by stevejaminson on 6/13/16.
 */
public class BeerGlassDispenserSpec {

    BeerGlassDispenser beerGlassDispenser = new BeerGlassDispenser();

    @Before
    public void init(){
        beerGlassDispenser = new BeerGlassDispenser();
    }

    @Test
    public void drinkDispenserTestSuper(){
        Class expected = new BeerGlassDispenser().getClass().getSuperclass();
        Class actual = beerGlassDispenser.getClass().getSuperclass();
        assertEquals(expected,actual);
    }

    @Test
    public void drinkDispenserTestClass(){
        Class expected = new BeerGlassDispenser().getClass();
        Class actual = beerGlassDispenser.getClass();
        assertEquals(expected,actual);
    }
}
