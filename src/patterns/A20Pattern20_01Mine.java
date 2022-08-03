package patterns;

import java.util.Scanner;

public class A20Pattern20_01Mine {
    public static void main(String[] args) {
        // n is odd
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int midPoint = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= n / 2) {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if (j == 1 || j == n || (i - midPoint == Math.abs(j - midPoint))) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }

            System.out.println();
        }
    }
}
