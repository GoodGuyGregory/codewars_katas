
// Kata: https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

package Java.Who_Likes_it;

public class who_likes_it {

    public static String whoLikesIt(String... names) {
        String likesCollection = "";
        // there are no likes
        if (names.length == 0) {
            return "no one likes this";
        } // there is only ONE like
        else if (names.length == 1) {
            for (String person : names) {
                return person + " likes this";
            }
        } // there are only TWO likes
        else if (names.length == 2) {

            for (int i = 0; i < names.length; i++) {
                likesCollection += names[i];
                if (i < 1) {
                    likesCollection += " and ";
                }
            }
            likesCollection += " like this";
        } else if (names.length == 3) {

            for (int i = 0; i < names.length; i++) {
                likesCollection += names[i];
                // add comma to the first name found.
                if (i < 1) {
                    likesCollection += ", ";
                }
                if (i == 1) {
                    likesCollection += " and ";
                }
            }
            likesCollection += " like this";
        } else {
            for (int i = 0; i < names.length; i++) {
                likesCollection += names[i];
                // add comma to the first name found.
                if (i < 1) {
                    likesCollection += ", ";
                }
                if (i == 1) {
                    likesCollection += " and ";
                    likesCollection += names.length - (i + 1) + " others";
                    break;
                }
            }
            likesCollection += " like this";
        }
        return likesCollection;
    }

    public static void main(String[] args) {

        // TESTS:
        // likes {} // must be "no one likes this"
        String[] likes = {};

        who_likes_it likesTest = new who_likes_it();

        System.out.println(likesTest.whoLikesIt(likes));

        // likes {"Peter"} // must be "Peter likes this"

        String[] likeswithOne = { "Peter" };

        System.out.println(likesTest.whoLikesIt(likeswithOne));

        // likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"

        String[] likeswithTwo = { "Jacob", "Alex" };

        System.out.println(likesTest.whoLikesIt(likeswithTwo));

        // likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"

        String[] likeswithThree = { "Max", "John", "Mark" };

        System.out.println(likesTest.whoLikesIt(likeswithThree));

        // likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others
        // like this"

        String[] likeswithFour = { "Alex", "Jacob", "Mark", "Max" };

        System.out.println(likesTest.whoLikesIt(likeswithFour));
    }
}
