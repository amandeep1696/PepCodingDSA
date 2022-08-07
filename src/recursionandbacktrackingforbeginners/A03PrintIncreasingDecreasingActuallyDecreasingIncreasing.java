package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A03PrintIncreasingDecreasingActuallyDecreasingIncreasing {
    public static void main(String[] args) {
        // 1 <= n <= 1000
        // Think like assume f(n-1) works. What do I have to do in f(n) and how can we leverage f(n-1) for it.
        // Write it up. Then think of base case.
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        printDecreasingIncreasingRecursive(num);
    }

    private static void printDecreasingIncreasingRecursive(int num) {
        if (num < 1) {
            return;
        }
        System.out.println(num);
        printDecreasingIncreasingRecursive(num - 1);
        System.out.println(num);
    }
}
