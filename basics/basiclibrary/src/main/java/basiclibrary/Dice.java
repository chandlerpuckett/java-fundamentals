package basiclibrary;

import java.text.DecimalFormat;
import java.util.Arrays;
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

    public double calculateAverages (int[] arr){

//        this method will calculate &
//        return the average of an array

        DecimalFormat df = new DecimalFormat("#.##");
        double sum = 0;

        for (int val : arr){
            sum += val;
        }

        double avg = sum / arr.length;
        return Double.parseDouble(df.format(avg));
    }

    public double returnLowestAverage (int[][] arr ){

//        this method will calculate the average of
//        each array & return the lowest average number

        DecimalFormat df = new DecimalFormat("#.##");

        double sum = 0;
        double lowest = Double.MAX_VALUE;

        for (int[] outer : arr){

            for (int val : outer){
                sum += val;
            }

            double avg = sum / outer.length;

            if (avg < lowest){
                lowest = avg;
            }
            sum = 0;
        }
        return Double.parseDouble(df.format(lowest));
    }

}
