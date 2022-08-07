package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A06PowerLogarithmicCalculatePowerUsingRecursion {
    public static void main(String[] args) {
        // 1 <= x <= 10
        // 0 <= n <= 9
        // The previous version expects the call stack to be of n height.
        // This function expects call function to be only log(n) high.
        // Time complexity O(log n)
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int power = scn.nextInt();
        System.out.println(getPowerLogarithmic(num, power));
    }

    private static int getPowerLogarithmic(int num, int power) {
        if (power == 0) {
            return 1;
        }

        if (power % 2 == 0) {
            return getPowerLogarithmic(num, power / 2) * getPowerLogarithmic(num, power / 2);
        } else {
            return num * getPowerLogarithmic(num, power / 2) * getPowerLogarithmic(num, power / 2);
        }
    }
}
