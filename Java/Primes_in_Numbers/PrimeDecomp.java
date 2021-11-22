
// Kata: https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java

import java.util.*;
import java.util.TreeMap;

public class PrimeDecomp {

    public static String factors(int n) {
        int[] primeFactors = { 2, 3, 5, 7, 11, 13, 17 };
        // TODO:
        // Create Results Hashmap for each prime values:
        // due to the fact that there could be multiples
        HashMap<Integer, Integer> primefactorValues = new HashMap<>();

        for (int number : primeFactors) {
            // casts element to string for enqueue
            primefactorValues.put(number, 0);
        }

        Map<Integer, Integer> sortedFactorMap = new TreeMap<Integer, Integer>(primefactorValues);

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

        for (int factorKey : sortedFactorMap.keySet()) {
            int totalElementFactorsFound = 0;
            for (Integer element : resultingFactors) {
                // found element that needs to be added to Hashmap
                if (element == factorKey) {
                    // increase the found count
                    totalElementFactorsFound += 1;
                }
            }
            sortedFactorMap.replace(factorKey, totalElementFactorsFound);
        }

        // Build Resulting Decomposed string
        StringBuilder decompFactors = new StringBuilder();
        for (int factorKey : sortedFactorMap.keySet()) {
            if (sortedFactorMap.get(factorKey) == 0) {
                continue;
            } else if (sortedFactorMap.get(factorKey) > 1) {
                String numOfFactors = String.valueOf(sortedFactorMap.get(factorKey));
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