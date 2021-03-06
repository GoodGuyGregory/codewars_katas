//  Kata: https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/train/java

public class Line {
    public static String Tickets(int[] peopleInLine) {
        // three spots for each bill and 10 slots for them.
        int[][] cashDrawer = new int[3][10];
        for (int payment : peopleInLine) {
            System.out.println("The ticket is $25.00 ");
            if (payment == 25) {
                for (int i = 0; i < cashDrawer[0].length; i++) {
                    if (cashDrawer[0][i] == 0) {
                        cashDrawer[0][i] = 25;
                        break;
                    }
                }
                System.out.println("Thank You! Enjoy the show!");
            }
            // Recieve a 50
            if (payment == 50) {
                System.out.println("Out of " + payment);

                // place in cashdrawer
                for (int i = 0; i < cashDrawer[1].length; i++) {
                    if (cashDrawer[1][i] == 0) {
                        cashDrawer[1][i] = 50;
                        break;
                    }
                }
                // Give Change from the cashDrawer
                System.out.println("Change for $50.00");
                for (int i = cashDrawer[0].length - 1; 0 <= i; i--) {
                    if (cashDrawer[0][i] == 25) {
                        cashDrawer[0][i] = 0;
                        break;
                    } else if (cashDrawer[0][i] == 0 && i == 0 && cashDrawer[0][i] != 25) {
                        return "NO";
                    }
                }
                System.out.println("Thank You! Enjoy the show!");

            }
            // Recieve a 100
            if (payment == 100) {
                System.out.println("Out of " + payment);
                // Check for any form of change in register
                if (cashDrawer[0][0] != 25) {
                    return "NO";

                }

                // Place 100 in the drawer
                for (int i = 0; i < cashDrawer[2].length; i++) {
                    if (cashDrawer[2][i] == 0) {
                        cashDrawer[2][i] = 100;
                        break;
                    }
                }
                // check if there are no 50s but enough 25s
                if (cashDrawer[1][0] != 50 && cashDrawer[0][0] == 25) {
                    // check to see if there are enough 25s to give change
                    int count = 0;
                    while (count != 75) {
                        for (int i = cashDrawer[0].length - 1; 0 <= i; i--) {
                            if (cashDrawer[0][i] == 25) {
                                cashDrawer[0][i] = 0;
                                count += 25;
                            } else if (cashDrawer[0][i] == 0 && i == 0 && cashDrawer[0][i] != 25) {
                                return "NO";
                            }
                        }
                    }

                }

                // Give Change of 75 with 50s and 25s
                if (cashDrawer[1][0] != 0 && cashDrawer[0][1] != 0) {

                    for (int i = cashDrawer[1].length - 1; 0 <= i; i--) {
                        if (cashDrawer[1][i] == 50) {
                            cashDrawer[1][i] = 0;
                            break;
                        } else if (cashDrawer[1][i] == 0 && i == 0) {
                            return "NO";
                        }
                    }
                    for (int i = cashDrawer[0].length - 1; 0 <= i; i--) {
                        if (cashDrawer[0][i] == 25) {
                            cashDrawer[0][i] = 0;
                            break;
                        } else if (cashDrawer[0][i] == 0 && i == 0) {
                            return "NO";
                        }
                    }
                }
                System.out.println("Change for $100.00");
                System.out.println("Thank You! Enjoy the show!");

            }

            // Display cashDrawer Contents
            System.out.println("Cash Drawer: ");
            System.out.println("=======================");
            for (int[] c : cashDrawer) {
                for (int i : c) {
                    System.out.print(i + "\t");
                }
                System.out.println("\n");
            }
        }
        return "YES";

    }

    public static void main(String[] args) {
        // Examples:
        Line examples = new Line();

        // System.out.println(examples.Tickets(new int[] { 25, 25, 50 }));// => YES

        // => NO. Vasya will not have enough money to give change to 100 dollars
        // System.out.println(examples.Tickets(new int[] { 25, 100 }));

        // => NO. Vasya will not have the right bills to give 75 dollars of change (you
        // can't make two bills of 25 from one of 50)
        // System.out.println(examples.Tickets(new int[] { 25, 25, 50, 50, 100 }));

        // => YES : case where 3 25s produce change
        // System.out.println(examples.Tickets(new int[] { 25, 25, 25, 100 }));

        // => YES : case where there is just enough for the last customer
        // System.out.println(examples.Tickets(new int[] { 25, 25, 50, 100 }));

        // => NO : case where the first customer pays with a 50
        // System.out.println(examples.Tickets(new int[] { 50, 50, 50, 50, 50, 50, 50,
        // 50, 50, 50 }));

        // => YES
        // System.out.println(examples.Tickets(new int[] { 25, 25, 25, 25, 50, 100 }));

        // => N0
        // System.out.println(examples.Tickets(new int[] { 25, 25, 25, 25, 25, 25, 25,
        // 50, 50, 50, 100, 100, 100, 100 }));

        // => YES
        System.out.println(examples.Tickets(new int[] { 25, 25, 25, 100 }));
    }
}
