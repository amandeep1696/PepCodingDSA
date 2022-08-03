package patterns;

import java.util.Scanner;

public class A13Pattern13 {
    public static void main(String[] args) {
        // nC0 = nCn = 1.    nCk = nCn-k.    5C0 5C1 5C2 5C3 5C4 5C5
        // nCk+1 = (nCk * (n-k))/(k+1)
        // iCj+1 = (iCj * (i-j))/(j+1)

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}
