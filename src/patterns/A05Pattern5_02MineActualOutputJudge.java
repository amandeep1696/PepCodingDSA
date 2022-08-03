package patterns;

import java.util.Scanner;

public class A05Pattern5_02MineActualOutputJudge {
    public static void main(String[] args) {
        // n is odd
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // 2, 1    1, 3     0, 5    1, 3    2, 1

        int midPoint = n/2 + 1;
        int numOfStars = 1;
        for (int i = 1; i <= n; i++) {
            int numOfTabs = Math.abs(midPoint - i);

            for (int j = 1; j <= numOfTabs; j++){
                System.out.print("\t");
            }
            for (int j = 1; j <= numOfStars; j++){
                System.out.print("*\t");
            }

            System.out.println();

            if (i < midPoint) {
                numOfStars += 2;
            } else {
                numOfStars -= 2;
            }
        }
    }
}
