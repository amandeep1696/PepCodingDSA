package patterns;

import java.util.Scanner;

public class A03Pattern3_MineForMyself {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int numOfStars = 1; numOfStars <= n; numOfStars++) {
            int numOfTabs = n - numOfStars;

            for (int j = 1; j <= numOfTabs; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= numOfStars; j++) {
                System.out.print("*");
                if (j != numOfStars) {
                    System.out.print("\t");
                }
            }

            if (numOfStars != n) {
                System.out.println();
            }
        }
    }
}
