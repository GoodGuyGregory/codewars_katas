import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Kata: https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

public class Kata {
  public static String highAndLow(String numbers) {
    // Split String by Spaces
    int highest = 0;
    int lowest;
    String[] arrayNums = numbers.split(" ", 0);
    for (String number : arrayNums) {
      // find highest
      // convert to int and determine the value
      int numberInt = Integer.parseInt(number);
      if (highest < numberInt) {
        highest = numberInt;
      }
    }
    return Integer.toString(highest);
  }

  public static void main(String[] args) {
    // TEST DATA:

    Kata testClass = new Kata();

    System.out.println(testClass.highAndLow("1 2 3 4 5")); // return "5 1"
    testClass.highAndLow("1 2 -3 4 5"); // return "5 -3"
    // testClass.highAndLow("1 9 3 4 -5"); // return "9 -5"

    // Kata Test Results:
    // testClass.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
  }
}