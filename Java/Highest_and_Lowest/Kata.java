
// Kata: https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

public class Kata {
  public static String highAndLow(String numbers) {
    // Code here or
    return "throw towel";
  }

  public static void main(String[] args) {
    // TEST DATA:

    Kata testClass = new Kata();

    testClass.highAndLow("1 2 3 4 5"); // return "5 1"
    testClass.highAndLow("1 2 -3 4 5"); // return "5 -3"
    testClass.highAndLow("1 9 3 4 -5"); // return "9 -5"

    // Kata Test Results:
    testClass.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
  }
}