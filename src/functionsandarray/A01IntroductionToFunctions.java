package functionsandarray;

import java.util.Scanner;

public class A01IntroductionToFunctions {
    public static int getFactorial (int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nFact = getFactorial(n);
        int nmrFact = getFactorial(n - r);

        int nPr = nFact / nmrFact;
        System.out.println(nPr);
    }
}
