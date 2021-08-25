import java.util.ArrayList;

//  Kata: https://www.codewars.com/kata/5765870e190b1472ec0022a2/train/java

public class PathFinder {
    // static boolean pathFinder(String maze) {
    // // Your code here!!
    // return false;
    // }

    public static void pathFinder(String maze) {
        // check if the initial path is blocked
        if (maze.indexOf(0) == 'W') {
            // return false;
            System.out.println("Can't Complete");
            // return false;
        }

        // get maze size:
        int mazeSize = maze.indexOf('\n');
        // create a mazeArray based on incoming string
        char[][] mazeProblem = new char[maze.indexOf('\n')][maze.indexOf('\n')];

        // fix '\n' issue
        // maze.split(Pattern.matches([\n], maze));
        // uses a REGEX for the newline char
        String[] splitA = maze.split("\\n");
        String fullMaze = "";
        for (String mazeRows : splitA) {
            fullMaze += mazeRows;
        }

        // check concat logic:
        // System.out.println(fullMaze);

        // enqueue the string values:
        int k = 0;
        while (k < fullMaze.length()) {
            for (int i = 0; i < mazeProblem.length; i++) {
                for (int j = 0; j < mazeProblem.length; j++) {
                    // add maze entry
                    mazeProblem[i][j] += fullMaze.charAt(k);
                    k++;
                }
            }
        }

        // MAZE BUILD DONE:
        // =========================
        // TEST LOGIC FOR PRINTING STRUCTURE:

        // print working letters:
        // for (int i = 0; i < mazeProblem.length; i++) {
        // for (int j = 0; j < mazeProblem.length; j++) {
        // System.out.print(mazeProblem[i][j]);
        // }
        // }

        // PATH FINDING LOGIC:
        // =========================

    } // pathFinder Method

    } // PathFinder Class

    public static void main(String[] args) {

        PathFinder testPathFinder = new PathFinder();

        String a = ".W.\n" + ".W.\n" + "...",

                b = ".W.\n" + ".W.\n" + "W..",

                c = "......\n" + "......\n" + "......\n" + "......\n" + "......\n" + "......",

                d = "......\n" + "......\n" + "......\n" + "......\n" + ".....W\n" + "....W.";

        // System.out.println(a);
        // System.out.println(a.split(Pattern.matches("[\n]", a)));
        // System.out.println(a.indexOf('\n'));

        // TESTS:
        // pathFinder(a) -> true
        testPathFinder.pathFinder(a);
        // pathFinder(b) -> false
        // pathFinder(c) -> true
        // pathFinder(d) -> false
    }
}