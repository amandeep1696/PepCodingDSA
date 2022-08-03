package patterns;

import java.util.Scanner;

public class A15Pattern15 {
    public static void main(String[] args) {
        // n is odd
        // Going through the whole flow of how Sumeet mentioned in video
        /*

            *
        *   *   *
    *   *   *   *   *
        *   *   *
            *

            |
            V

            1
        1   1   1
    1   1   1   1   1
        1   1   1
            1

            |
            V

            1
        2   2   2
    3   3   3   3   3
        4   4   4
            5

            |
            V

            1
        2   2   2
    3   3   3   3   3
        2   2   2
            1

            |
            V

            1
        2   3   4
    3   4   5   6   7
        2   3   4
            1

            |
            V

            1
        2   3   2
    3   4   5   4   3
        2   3   2
            1

        */

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int numTabs = n / 2;
        int numStars = 1;
        int startNum = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numTabs; j++) {
                System.out.print("\t");
            }

            int numToPrint = startNum;
            for (int j = 1; j <= numStars; j++) {
                System.out.print(numToPrint + "\t");
                if (j <= numStars / 2) {
                    numToPrint++;
                } else {
                    numToPrint--;
                }
            }

            System.out.println();

            if (i <= n / 2) {
                numTabs--;
                numStars += 2;
                startNum++;
            } else {
                numTabs++;
                numStars -= 2;
                startNum--;
            }
        }
    }
}
