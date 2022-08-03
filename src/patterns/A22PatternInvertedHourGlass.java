package patterns;

import java.util.Scanner;

public class A22PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int numStars = n;
        int numTabs = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numTabs; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= numStars; j++) {
                if (i > n/2 + 1 && i < n && j > 1 && j < numStars) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            System.out.println();

            if (i <= n / 2) {
                numStars -= 2;
                numTabs++;
            } else {
                numStars += 2;
                numTabs--;
            }
        }
    }
}
