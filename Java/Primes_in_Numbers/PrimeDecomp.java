// Kata: https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java

public class PrimeDecomp {


    public static String factors(int n) {
        int[] primes = {2,3,5,7,11,13,17};
        for (int prime : primes) {
            System.out.println(prime);
        }
        return "Finished";
    }

    public static void main(String[] arg) {

        // 86240 :: should return "(2**5)(5)(7**2)(11)"
        System.out.println(factors(86240));
    }   
}