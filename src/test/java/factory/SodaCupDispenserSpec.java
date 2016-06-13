package factory;

import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class SodaCupDispenserSpec {

        SodaCupDispenser sodaCupDispenser = new SodaCupDispenser();

        @Before
        public void init(){
            sodaCupDispenser = new SodaCupDispenser();
        }

        @Test
        public void drinkDispenserTestSuper(){
            Class expected = new SodaCupDispenser().getClass().getSuperclass();
            Class actual = sodaCupDispenser.getClass().getSuperclass();
            assertEquals(expected,actual);
        }

        @Test
        public void drinkDispenserTestClass(){
            Class expected = new SodaCupDispenser().getClass();
            Class actual = sodaCupDispenser.getClass();
            assertEquals(expected,actual);
        }
}
