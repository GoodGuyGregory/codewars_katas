// Kata: https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
import java.lang.*;

public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder camelCaseBreak = new StringBuilder();
        if (input.isEmpty()) {
            return input;
        }
        else {
            
            char[] inputLetters = input.toCharArray();
            for (int i = 0; i < inputLetters.length; i++) {
                if (Character.isUpperCase(inputLetters[i])) {
                    // String foundLetter = String.format("%s is uppercase, found at %s",inputLetters[i], i);
                    // System.out.println(foundLetter);
                    camelCaseBreak.append(" " + inputLetters[i]);
                }
                else {
                    camelCaseBreak.append(inputLetters[i]);
                }
                
            }
        }
        return camelCaseBreak.toString();
      }
      
      public static void main(String[] args) {
          
        // TEST CASES:
        // =================================================
        
        // "camelCasing"  =>  "camel Casing"
        // "identifier"   =>  "identifier"
        // ""             =>  ""
        
        System.out.println(camelCase("inputString"));
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("identifier"));
        System.out.println(camelCase(""));
        System.out.println(camelCase("camelCasingTest"));
        System.out.println(camelCase("camelcasingtest"));
    }


}
