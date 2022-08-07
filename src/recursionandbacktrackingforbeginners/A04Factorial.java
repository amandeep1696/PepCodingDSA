package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A04Factorial {
    public static void main(String[] args) {
        // 0 <= n <= 10
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(getFactorial(num));
    }

    private static int getFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }
}
