
// Kata: https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java

import java.util.*;

public class PrimeDecomp {

    public static LinkedHashMap<Integer, Integer> loadMap() {
        int[] primeFactors = { 2, 3, 5, 7, 11, 13, 17 };

        LinkedHashMap<Integer, Integer> primeFactorMap = new LinkedHashMap<>();

        for (int number : primeFactors) {
            // casts element to string for enqueue
            primeFactorMap.put(number, 0);
        }

        return primeFactorMap;

    }

    public static String factors(int n) {
        LinkedHashMap<Integer, Integer> primefactorValues = loadMap();

        while (n != 1) {
            for (int primefactor : primefactorValues.keySet()) {
                if (n % primefactor == 0) {
                    int currentFactorCount = primefactorValues.get(primefactor);
                    // reduce size
                    n /= primefactor;
                    primefactorValues.replace(primefactor, (currentFactorCount + 1));
                }
            }
        }

        // Build Resulting Decomposed string
        StringBuilder decompFactors = new StringBuilder();
        for (int factorKey : primefactorValues.keySet()) {
            if (primefactorValues.get(factorKey) == 0) {
                continue;
            } else if (primefactorValues.get(factorKey) > 1) {
                String numOfFactors = String.valueOf(primefactorValues.get(factorKey));
                decompFactors.append("(" + factorKey + "**" + numOfFactors + ")");
            } else {
                decompFactors.append("(" + String.valueOf(factorKey) + ")");
            }
        }
        return decompFactors.toString();
    }

    public static void main(String[] arg) {

        // Youtube Example Case:
        // 30 : should return "(2)(3)(5)"
        System.out.println(factors(30));

        // 86240 :: should return "(2**5)(5)(7**2)(11)"
        System.out.println(factors(86240));

    }
}