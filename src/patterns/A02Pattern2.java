package patterns;

import java.util.Scanner;

public class A02Pattern2 {
    public static void main(String[] args) {
        // Think about inner loop first. Then think of it as magic. However, much is i it will print those many *.
        // Then think of outer loop which gives order to inner loop to print i number of *.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if(j != i) {
                    System.out.print("\t");
                }
            }
            if (i != 1) {
                System.out.println();
            }
        }
    }
}
