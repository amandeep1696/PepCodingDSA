package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A02PrintIncreasingRecursionMotion {
    public static void main(String[] args) {
        // 1 <= n <= 1000
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        printIncreasingRecursive(num);
    }

    private static void printIncreasingRecursive(int num) {
        if (num < 1) {
            return;
        }

        printIncreasingRecursive(num - 1);
        System.out.println(num);
    }
}
