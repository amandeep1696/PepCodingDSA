package patterns;

import java.util.Scanner;

public class A10Pattern10_02MineForJudge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int leftStarColumn = n / 2 + 1;
        int rightStarColumn = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == rightStarColumn) {
                    System.out.print("*\t");
                    break;
                } else if (j == leftStarColumn) {
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
