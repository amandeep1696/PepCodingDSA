package patterns;

import java.util.Scanner;

public class A04Pattern4_MineForMyself {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int numOfTabs = 0; numOfTabs < n; numOfTabs++) {
            int numOfStars = n - numOfTabs;
            for (int j = 1; j <= numOfTabs; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= numOfStars; j++) {
                System.out.print("*");
                if (j != numOfStars) {
                    System.out.print("\t");
                }
            }
            if (numOfTabs != n-1) {
                System.out.println();
            }
        }
    }
}
