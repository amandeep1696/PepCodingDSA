package patterns;

import java.util.Scanner;

public class A05Pattern5_03Theirs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nspaces = n / 2;   // 2,1   1,3    0,5    1,3   2,1
        int nstars = 1;

        // i = 1 2,1 -> 1,3  i=2 1,3 -> 0,5  i = 3 0,5 -> 1,3   i=4 1,3->2,1  i=5 2,1 -> 3,-1(Not run)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nspaces; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= nstars; j++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                nspaces--;
                nstars += 2;
            } else {
                nspaces++;
                nstars -= 2;
            }

            System.out.println();
        }
    }
}
