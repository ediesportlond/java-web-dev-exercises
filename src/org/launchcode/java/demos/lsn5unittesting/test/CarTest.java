package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    Car testCar;
    @Before
    public void createTestCar(){
        testCar = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testGasTankLevel(){
        assertEquals(testCar.getGasTankSize(), testCar.getGasTankLevel(), .001);
    }

    @Test
    public void gasTankNotEmpty(){
        assertFalse(testCar.getGasTankLevel() == 0);
    }

    @Test
    public void gasTankFull(){
        assertTrue(testCar.getGasTankSize() == testCar.getGasTankLevel());
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testRange(){
        testCar.drive(50);
        assertEquals(9, testCar.getGasTankLevel(), .001 );
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testMaxRange(){
        testCar.drive(
                (testCar.getGasTankLevel()*testCar.getMilesPerGallon())+1
        );
        assertFalse(testCar.getGasTankLevel() < 0);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        testCar.addGas(11);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}
