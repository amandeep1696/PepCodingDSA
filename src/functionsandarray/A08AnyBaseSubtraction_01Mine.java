package functionsandarray;

import java.util.Scanner;

public class A08AnyBaseSubtraction_01Mine {
    public static void main(String[] args) {
        // Base between 2 and 10 inclusive. num1 <= num2.
        // Can see question vid for clarity on logic.
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        System.out.println(getSubtractionForBase(num1, num2, base));
    }

    public static int getSubtractionForBase(int num1, int num2, int base) {
        int ans = 0;
        int multiplier = 1;
        boolean isBorrow = false;
        while (num2 != 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            if (isBorrow) {
                digit2--;
                isBorrow = false;
            }

            if (digit2 < digit1) {
                digit2 = digit2 + base;
                isBorrow = true;
            }

            int ansDigit = digit2 - digit1;
            ans = ans + (ansDigit * multiplier);

            num1 = num1 / 10;
            num2 = num2 / 10;
            multiplier = multiplier * 10;
        }

        return ans;
    }
}
