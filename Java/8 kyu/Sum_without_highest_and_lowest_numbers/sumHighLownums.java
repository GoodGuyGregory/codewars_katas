import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// Kata: https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java

public class SumHighLownums {
    public static int sum(int[] numbers){
        if (numbers == null || numbers.length == 1 || numbers.length == 0 ) {
            return 0;
        }
        else {
            System.out.println(Arrays.toString(numbers));
            int highest = 0;
            int lowest = 0;
            
            for (int i : numbers) {
                // find highest
                if (i > 0) {
                    if (i >= numbers[0] && i > highest) {
                        highest = i;
                    }
                    if (i <= numbers[0]) {
                        lowest = i;
                    }
                }
                
                else if (i < 0 && highest <= 0) {
                    if (i >= numbers[0]) {
                        highest = i;
                    }
                    if (i <= numbers[0]) {
                        lowest = i;
                    }
                }
            }

            // confirm lowest value in the list
            for (int i : numbers) {
                if (i <= lowest) {
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

    }

    public static void main(String[] args) {

        // TEST CASES:
        // =======================================

        // { 6, 2, 1, 8, 10 } => 16
        // { 1, 1, 11, 2, 3 } => 6

        System.out.println(sum(new int[] { 6, 2, 1, 8, 10}));
        System.out.println(sum(new int[] { 1, 1, 11, 2, 3 }));
        

        // null test:
        System.out.println(sum(null));
        
        // SumPositivesWithDoubleMax
       // [6, 0, 1, 10, 10] => 17 
        System.out.println(sum(new int[] { 6, 0, 1, 10, 10}));

        //  Sum Negative Cases:
        // [-6, -20, -1, -10, -12] => -28

        System.out.println(sum(new int[] { -6, -20, -1, -10, -12}));

        // Sum Mixed Cases:
        // [-6, 20, -1, 10, -12] => <3>
        System.out.println(sum(new int[] {-6, 20, -1, 10, -12 }));

    
        // Sum Random Cases:
//         [104, -453, 540, 313, 458, 470]
//         [-473, 468, -15, 36, 410, 506]
//         [-492, -33, -242, -441, -448, 136]
//         [-269, 256, 100, -4, 76, 360]
//         [73, 319, -57, 418, 42, 582] => 852
        System.out.println(sum(new int[] {104, -453, 540, 313, 458, 470,
                                            -473, 468, -15, 36, 410, 506,
                                        -492, -33, -242, -441, -448, 136,
                                        -269, 256, 100, -4, 76, 360,  73,
                                        319, -57, 418, 42, 582}));

    }   
}