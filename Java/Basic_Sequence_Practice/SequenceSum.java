// Kata: https://www.codewars.com/kata/5436f26c4e3d6c40e5000282/train/java

package Java.Basic_Sequence_Practice;

import java.lang.Math;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        // create array based on size
        int[] sequenceHolderArray = new int[Math.abs(n) + 1];
        System.out.print(n + " --> ");
        int sum = 0;
        if (n > 0) {
            System.out.print("[ ");
            for (int i = 0; i < sequenceHolderArray.length; i++) {
                sum += i;
                sequenceHolderArray[i] = sum;
                if (i == sequenceHolderArray.length - 1) {
                    System.out.print(sequenceHolderArray[i]);
                    break;
                }
                System.out.print(sequenceHolderArray[i] + ", ");
            }
            System.out.print(" ]");

        } else {
            System.out.print("[ ");
            for (int i = 0; i < sequenceHolderArray.length; i++) {
                sum += i;
                sequenceHolderArray[i] = -sum;
                if (i == sequenceHolderArray.length - 1) {
                    System.out.print(sequenceHolderArray[i]);
                    break;
                }
                System.out.print(sequenceHolderArray[i] + ", ");
            }
            System.out.print(" ]");
        }
        return sequenceHolderArray;

    }

    public static void main(String[] args) {

        // Uncomment Code to See Solution in Array form

        SequenceSum SequenceTest = new SequenceSum();
        // Test Example with "5"
        // SequenceTest.sumOfN(5)

        // Test Example with "-5"
        // SequenceTest.sumOfN(-5);

        // Test Example with "-5"
        SequenceTest.sumOfN(7);

    }

}