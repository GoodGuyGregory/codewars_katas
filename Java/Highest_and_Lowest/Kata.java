
// Kata: https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

public class Kata {
  public static String highAndLow(String numbers) {
    // Split String by Spaces
    int highest = 0;
    int lowest = 0;
    String[] arrayNums = numbers.split(" ", 0);
    // size of 1 string
    if (arrayNums.length == 1) {
      highest = Integer.parseInt(arrayNums[0]);
      lowest = Integer.parseInt(arrayNums[0]);
    }
    // the same number
    else if (arrayNums.length == 2 && Integer.parseInt(arrayNums[0]) == Integer.parseInt(arrayNums[1])) {
      highest = Integer.parseInt(arrayNums[0]);
      lowest = Integer.parseInt(arrayNums[0]);
    } else {
      for (String number : arrayNums) {
        // find highest
        // convert to int and determine the value
        int numberInt = Integer.parseInt(number);
        if (highest < numberInt) {
          highest = numberInt;
        }

        // find the lowest
        if (lowest > numberInt) {
          lowest = numberInt;
        }
      }
    }
    String highestAndLowest = Integer.toString(highest) + " " + Integer.toString(lowest);
    return highestAndLowest;
  }

  public static void main(String[] args) {
    // TEST DATA:

    Kata testClass = new Kata();

    System.out.println(testClass.highAndLow("1 2 3 4 5")); // return "5 1"
    System.out.println(testClass.highAndLow("1 2 -3 4 5")); // return "5 -3"
    System.out.println(testClass.highAndLow("1 9 3 4 -5")); // return "9 -5"

    // Kata Test Results:
    // testClass.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");

    // Single Test:
    System.out.println(testClass.highAndLow("42"));
    System.out.println(testClass.highAndLow("-1 -1"));
    System.out.println(testClass.highAndLow("1 1"));

  }
}