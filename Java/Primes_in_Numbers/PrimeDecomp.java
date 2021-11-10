// Kata: https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java

public class PrimeDecomp {


    public static String factors(int n) {
        int[] primes = {17,13,11,7,5,3,2};

        for (int prime : primes) {
            if (n % prime == 0) {
                System.out.println(prime + " is a factor");
            }
        }
        return "Finished";
    }

    public static void main(String[] arg) {

        // 86240 :: should return "(2**5)(5)(7**2)(11)"
        System.out.println(factors(86240));
    }   
}