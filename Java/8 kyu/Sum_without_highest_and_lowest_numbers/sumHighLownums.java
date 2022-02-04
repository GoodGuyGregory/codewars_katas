import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Kata: https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java

public class SumHighLownums {
    public static int sum(int[] numbers){
        int highest = 0;
        int lowest = 0;
        
        for (int i : numbers) {
            // find highest
            if (i >= numbers[0] && i > highest) {
                highest = i;
            }
            // find lowest
            if (i <= numbers[0]) {
                lowest = i;
            }
        }

        // create arraylist to hold and remove the first index 
        // of the higest and lowest values in the list of nums

        List<Integer> numsList = new ArrayList<Integer>(numbers.length);

        for (int i : numbers) {
            numsList.add(i);
        }

        // removes highest
        numsList.remove(numsList.indexOf(highest));
        // removes lowest
        numsList.remove(numsList.indexOf(lowest));


        int sum = 0;
        
        for (int i : numsList) {
                sum += i;
            }
        

        return sum;
    }

    public static void main(String[] args) {

        // TEST CASES:
        // =======================================

        // { 6, 2, 1, 8, 10 } => 16
        // { 1, 1, 11, 2, 3 } => 6

        System.out.println(sum(new int[] { 6, 2, 1, 8, 10}));
        System.out.println(sum(new int[] { 1, 1, 11, 2, 3 }));
    }
}