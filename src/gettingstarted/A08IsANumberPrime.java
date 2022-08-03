package gettingstarted;

import java.util.Scanner;

public class A08IsANumberPrime {
    public static void main(String[] args) {
        isPrimeOptimized();
    }

    private static void isPrimeBasic() {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }

    // if pq = n then both p and q cannot be > n. At max both can be equal to sqrt(n)
    // if a number is non-prime, it will be divided by
    // a number smaller than or equal to its square-root(or the closest integer value to it),
    // and if it cannot be divided, it can be said that the number is prime.
    // so we only need to loop till sqrt(n)
    // No need for one divisibility check as everything is divisible by one.
    // If bw 2 and sqrt(n) anything divides the number, then it is not prime
    // 1 needs to be handled explicitly. 2 and 3 are handled by default as loop never runs for them.

    private static void isPrimeOptimized() {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scn.nextInt();

            if (n == 1) {
                System.out.println("Not Prime");
                continue;
            }

            int count = 0; // Can also keep a boolean flag. Initially as true. Then set false if divisible.
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
