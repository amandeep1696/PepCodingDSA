package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A01PrintDecreasingIntroductionToRecursion {
    public static void main(String[] args) {
        // 1 <= n <= 1000
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        printDecreasingRecursive(num);
    }

    private static void printDecreasingRecursive(int num) {
        if (num < 1) {
            return;
        }

        System.out.println(num);
        printDecreasingRecursive(num - 1);
    }
}
