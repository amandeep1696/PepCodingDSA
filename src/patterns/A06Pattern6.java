package patterns;

import java.util.Scanner;

public class A06Pattern6 {
    public static void main(String[] args) {
        // n is odd
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // 3,1,3   2,3,2   1,5,1   2,3,2   3,1,3

        int numStars = n/2 + 1;
        int numTabs = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*\t");
//                if (j != numStars) {
//                    System.out.print("\t");
//                }
            }
            for (int j = 1; j <= numTabs; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*\t");
            }

            if (i < n / 2) {
                numStars--;
                numTabs += 2;
            } else {
                numStars++;
                numTabs -= 2;
            }

            System.out.println();
        }
    }
}
