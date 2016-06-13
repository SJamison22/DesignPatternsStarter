package abstractfactory;

import io.zipcoder.designpatterns.abstractfactory.SodaDispensingSystem;
import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import io.zipcoder.designpatterns.factory.SodaMachine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 6/13/16.
 */
public class SodaDispensingSystemSpec {

    SodaDispensingSystem sodaDispensingSystem;

    @Before
    public void init(){
        sodaDispensingSystem = new SodaDispensingSystem();
    }

    @Test
    public void drinkDispenserTest(){
        Class expected = new SodaMachine().getClass();
        Class actual = sodaDispensingSystem.drinkDispenser().getClass();
        assertEquals(expected,actual);
    }

    @Test
    public void cupDispenserTest(){
        Class expected = new SodaCupDispenser().getClass();
        Class actual = sodaDispensingSystem.cupDispenser().getClass();
        assertEquals(expected,actual);
    }

}
