package patterns;

import java.util.Scanner;

public class A01Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if(j != i) {
                    System.out.print("\t");
                }
            }
            if (i != n-1) {
                System.out.println();
            }
        }
    }
}
