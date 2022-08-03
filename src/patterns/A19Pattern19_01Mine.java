package patterns;

import java.util.Scanner;

public class A19Pattern19_01Mine {
    public static void main(String[] args) {
        // n is odd
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i == n / 2 + 1) || (i == 1 && (j <= n / 2 + 1 || j == n)) || (i == n && (j == 1 || j >= n / 2 + 1)) || (i > 1 && i <= n / 2 && (j == n / 2 + 1 || j == n)) || (i > n / 2 + 1 && i < n && (j == 1 || j == n / 2 + 1))) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
