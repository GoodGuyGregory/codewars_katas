// Kata: https://www.codewars.com/kata/559536379512a64472000053/train/java

public class Playing_Passphrases {
    
    //  Steps in this process...
    // 1.    shift each letter by a given number but the transformed letter 
    // must be a letter (circular shift),
    // 2. replace each digit by its complement to 9,
    // 3. keep such as non alphabetic and non digit characters,
    // 4. downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
    // 5. reverse the whole result.

    public static String playPass(String s, int n) {
        
        String shiftedLetters = "";
        // 1. Ci*rcular Shift Letters:
        for (char letter : s.toCharArray()) {            
            // System.out.println("letter " + letter + " is " + (int) letter + " in ASCII");
            // determine case
            int asciiVal = (int) letter;

            if (asciiVal == 32 ) {
                // add a space to the string
                letter = (char) asciiVal;
                shiftedLetters += letter; 
            }
            // Capital Letter Range 65-90
            if (asciiVal >= 65 && asciiVal <= 90) {
                // begin shifting
                if ((asciiVal += n) <= 90) {
                    letter = (char) asciiVal;
                    // System.out.println("shifting to " + letter);
                    shiftedLetters += letter;
                }
                else {
                    // System.out.println("Value shift too high!");
                    int circularDiff = asciiVal - 90;
                    // System.out.println(circularDiff + " has been Calculated as the new character");
                    letter = (char) ((circularDiff - 1) + 65);
                    // System.out.println("with a ascii value of " + letter );
                    shiftedLetters += letter;
                }
                
            }
            // Lower Letter Range 95-122
            if (asciiVal >= 95 && asciiVal <= 122) {

            }
        }
        System.out.println(s + " became " + shiftedLetters);
        return s;
    }

    public static void main(String[] args) {
        
        playPass( "BORN IN 2015!", 1);
        playPass("PEOPLE CHANGE", 11);


    }

}