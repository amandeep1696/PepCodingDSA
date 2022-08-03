package gettingstarted;

import java.util.Scanner;

public class A17PrimeFactorizationOfANumber {
    public static void main(String[] args) {
        // Number between 2 and 10^9
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        printPrimeFactorsOptimized(num);
    }

    private static void printPrimeFactorsUnoptimized(int num) {
        for (int div = 2; div <= num; div++) { // I would have written as a while loop in start. Later change to for.
            while (num % div == 0) {
                num = num / div;
                System.out.println(div);
            }
        }
    }

    private static void printPrimeFactorsOptimized(int num) {
        for (int div = 2; div * div <= num; div++) {
            while (num % div == 0) {
                num = num / div;
                System.out.println(div);
            }
        }
        if (num > 1) {   // Example 46. 2 and 23. There will only be one prime factor greater than sqrt(num).
            System.out.println(num);
        }
    }
}
