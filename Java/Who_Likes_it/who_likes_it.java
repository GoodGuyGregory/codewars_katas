
// Kata: https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

package Java.Who_Likes_it;

public class who_likes_it {

    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        } else {
            String likesCollection = "";
            for (int i = 0; i < names.length; i++) {
                likesCollection += names[i] + " likes this";
            }
            return likesCollection;
        }
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
        // likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others
        // like this"

    }
}
