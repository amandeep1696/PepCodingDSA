package patterns;

import java.util.Scanner;

public class A10Pattern10_01MineMyInterpretation {
    public static void main(String[] args) {
        // n is odd
        // 1,3     2,2  2,4    3,1  3,5    4,2  4,4    5,3
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int leftStarColumn = n / 2 + 1;
        int rightStarColumn = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == leftStarColumn || j == rightStarColumn) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            if (i <= n/2) {
                leftStarColumn--;
                rightStarColumn++;
            } else {
                leftStarColumn++;
                rightStarColumn--;
            }
        }
    }
}
