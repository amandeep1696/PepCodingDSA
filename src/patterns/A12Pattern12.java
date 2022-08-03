package patterns;

import java.util.Scanner;

public class A12Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int currentFibonacciNumber = 0;
        int nextFibonacciNumber = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentFibonacciNumber + "\t");

                int temp = currentFibonacciNumber + nextFibonacciNumber;
                currentFibonacciNumber = nextFibonacciNumber;
                nextFibonacciNumber = temp;
            }
            System.out.println();
        }
    }
}
