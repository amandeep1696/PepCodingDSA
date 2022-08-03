package patterns;

import java.util.Scanner;

public class A05Pattern5_01MineMyInterpretationOfJudge {
    public static void main(String[] args) {
        // n is odd
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //int numOfTabs; // 4,1  2,3  0,5   2,3   4,1
        //int numOfStars;
        // 1, 2, 3, 4, 5       n/2 + 1   =   3      (3-1)*2

        int midPoint = n/2 + 1;
        for (int i = 1; i <= n; i++) {
            int numOfTabs = Math.abs((midPoint - i) * 2);
            int numOfStars = n - numOfTabs;

            for (int j = 1; j <= numOfTabs / 2; j++){
                System.out.print("\t");
            }
            for (int j = 1; j <= numOfStars; j++){
                System.out.print("*");
                if (j != numOfStars) {
                    System.out.print("\t");
                }
            }
            for (int j = 1; j <= numOfTabs / 2; j++){
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
