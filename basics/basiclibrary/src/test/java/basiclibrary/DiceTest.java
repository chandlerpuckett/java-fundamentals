package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void testDiceRoll (){

        Dice test = new Dice();
        int newArr[] = test.roll(5);
        assertEquals(newArr.length,5);

    }


    @Test
    public void testDuplicateMethod(){

        Dice test = new Dice();

        int[] dupArray = {1,1,2,3,4};
        int[] nonDup = {1,2,3,4,5,6};

        assertTrue("true", test.containsDuplicates(dupArray));
        assertFalse("false", test.containsDuplicates(nonDup));

    }

    @Test
    public void testArrayAverage(){

        Dice test = new Dice();

        int[] arr1 = {2,3,4,5,6};
        assertTrue("true", test.calculateAverages(arr1) == 4.0);

        int[] arr2 = {10,14,18,22};
        assertTrue("true", test.calculateAverages(arr2) == 16.0);

        int[] arr3 = {7,6,9};
        assertTrue("true", test.calculateAverages(arr3) == 7.33);


    }


}
