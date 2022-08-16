// Kata: https://www.codewars.com/kata/5aa736a455f906981800360d/train/java

public class FeastOfManyBeasts {

    public static boolean feast(String beast, String dish) {
        if (dish.matches("\\d+")) {
            return false;
        } else {
            String[] dishBrought = dish.split(" ");
            for (int i = 0; i < dishBrought.length; i++) {
                if (beast.contains(String.valueOf(dishBrought[i].charAt(0)))) {
                    CharSequence lastLetter = String.valueOf(dishBrought[i].charAt(dishBrought[i].length() - 1));
                    if (beast.contains(lastLetter)) {
                        continue;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {

        FeastOfManyBeasts FeastTest = new FeastOfManyBeasts();

        System.out.println(FeastTest.feast("great blue heron", "garlic nann"));
        System.out.println(FeastTest.feast("chickadee", "chocolate cake"));
        System.out.println(FeastTest.feast("brown bear", "bear claw"));
        System.out.println(FeastTest.feast("slow loris", "salsas"));
        System.out.println(FeastTest.feast("ox", "orange lox"));

    }

}
