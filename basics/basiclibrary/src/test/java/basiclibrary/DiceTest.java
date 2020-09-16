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
        assertEquals("true", 4.0, test.calculateAverages(arr1), 0.0);

        int[] arr2 = {10,14,18,22};
        assertEquals("true", 16.0, test.calculateAverages(arr2), 0.0);

        int[] arr3 = {7,6,9};
        assertEquals("true", 7.33, test.calculateAverages(arr3), 0.0);


    }

    @Test
    public void testNestedArrays(){

        Dice test = new Dice();

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60}, // 63
                {57, 65, 65, 70, 72, 65, 51}, // 63.57
                {55, 54, 60, 53, 59, 57, 61}, // 57
                {65, 56, 55, 52, 55, 62, 57}  // 57.42
        };

        assertEquals("true", 57, test.returnLowestAverage(weeklyMonthTemperatures), 0.0);


    }


}
