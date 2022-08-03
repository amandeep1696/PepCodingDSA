package patterns;

import java.util.Scanner;

public class A20Pattern20_02Theirs {
    public static void main(String[] args) {
        // Diagonal is either i == j  or  i + j == n + 1.  Learnt at the start.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                } else if (i > n / 2 && (i == j || i + j == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}