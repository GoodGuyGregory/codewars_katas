// Kata: https://www.codewars.com/kata/5436f26c4e3d6c40e5000282/train/java

package Java.Basic_Sequence_Practice;

import java.lang.Math;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        // create array based on size
        int[] sequenceHolderArray = new int[Math.abs(n) + 1];
        System.out.print(n + " --> ");
        System.out.print("[ ");
        for (int i = 0; i < sequenceHolderArray.length; i++) {
            System.out.print(sequenceHolderArray[i] + ", ");
        }
        System.out.print("]");
        return sequenceHolderArray;

    }

    public static void main(String[] args) {

        SequenceSum SequenceTest = new SequenceSum();

        SequenceTest.sumOfN(3);
    }

}