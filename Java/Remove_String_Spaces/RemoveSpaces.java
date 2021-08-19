// Kata: https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java

public class RemoveSpaces {
    public static String noSpace(final String x) {
        String noSpaceString = "";
        // supply regex with space arguments
        noSpaceString = x.replaceAll("\\s", "");
        return noSpaceString;
    }

    public static void main(String[] args) {

        // creat test class:
        RemoveSpaces testClass = new RemoveSpaces();

        // Tests:
        //
        System.out.println(testClass.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));

        //
        System.out.println(testClass.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));

        //
        System.out.println(testClass.noSpace("8aaaaa dddd r     "));

        //
        System.out.println(testClass.noSpace("jfBm  gk lf8hg  88lbe8 "));

        //
        System.out.println(testClass.noSpace("8j aam"));
    }

} // RemoveSpaces