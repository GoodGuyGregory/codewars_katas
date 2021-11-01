import java.util.ArrayList;

// Kata: https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java

public class Kata {

    public static int countPassengers(ArrayList<int[]> stops) {
        int busOccupants = 0;
        // iterate through the arraylist
        for ( int[] stop : stops)  {
            int incomingOccupants = stop[0];
            int outcomingOccupants = stop[1];
            // calculate those entering the bus
            busOccupants += incomingOccupants;
            // calculate those leaving the bus
            busOccupants -= outcomingOccupants;
        };
        
        return busOccupants;
    }

    public static void main(String[] args) {
        

        // Test Cases:
        // ====================================================

        // Example One:
        // ====================================================
        ArrayList<int[]> listOne = new ArrayList<int[]>();
        listOne.add(new int[] {10,0});
        listOne.add(new int[] {3,5});
        listOne.add(new int[] {2,5});

        System.out.println(countPassengers(listOne));
    }
}