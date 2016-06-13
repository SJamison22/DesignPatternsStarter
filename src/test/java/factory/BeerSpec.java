package factory;

import io.zipcoder.designpatterns.factory.Beer;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class BeerSpec {

        Beer beer;

        @Before
        public void init(){
            beer = new Beer();
        }

        @Test
        public void drinkDispenserTestClass(){
            Class expected = new Beer().getClass();
            Class actual = beer.getClass();
            assertEquals(expected,actual);
        }

        @Test
        public void drinkDispenserTestInterface(){
           Class expected = new Beer().getClass().getInterfaces()[0];
           Class actual = beer.getClass().getInterfaces()[0];
           assertEquals(expected,actual);
        }


}
