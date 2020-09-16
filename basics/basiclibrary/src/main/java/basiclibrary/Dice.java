package basiclibrary;

import java.util.HashSet;
import java.util.Set;

public class Dice {

    private int dice;

    public int[] roll (int n) {
//      while loop to roll
        int count = 0;
        int[] rollValues = new int[n];

        while (count < n){
//      Roll Dice here
            rollValues[count] = (int) (Math.random()*6) + 1;
            count++;
        }
        return rollValues;
    }

    public boolean containsDuplicates (int[] arr){

        boolean test = false;

//      Hash Set stuff:
//      https://javarevisited.blogspot.com/2015/06/3-ways-to-find-duplicate-elements-in-array-java.html

        Set<Integer> store = new HashSet<>();

        for (int val : arr){
            if (!store.add(val)){
                test = true;
            }
        }
        return test;
    }

}
