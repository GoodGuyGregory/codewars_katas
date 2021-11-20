// Kata: https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java

import java.util.*;

public class PrimeDecomp {

    public static String factors(int n) {
        int[] primeFactors = { 2, 3, 5, 7, 11, 13, 17 };
        // TODO:
        // Create Results Hashmap for each prime values:
        // due to the fact that there could be multiples:

        // holds factors based on divisibility
        ArrayList<Integer> resultingFactors = new ArrayList<Integer>(0);
        while (n != 1) {
            for (int primefactor : primeFactors) {
                if (n % primefactor == 0) {
                    // reduce size
                    n /= primefactor;
                    resultingFactors.add(primefactor);
                }
            }
        }

        for (Integer result : resultingFactors) {
            System.out.println(result);
        }
        return "Finished";
    }

    public static void main(String[] arg) {

        // Youtube Example Case:
        // 30 : should return "(2)(3)(5)"
        System.out.println(factors(30));

        // 86240 :: should return "(2**5)(5)(7**2)(11)"
        // System.out.println(factors(86240));

    }
}