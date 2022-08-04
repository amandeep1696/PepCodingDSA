package functionsandarray;

import java.util.Scanner;

public class A09AnyBaseMultiplication {
    public static void main(String[] args) {
        // Base between 2 and 10 inclusive.
        // See question video for logic.
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        System.out.println(getMultiplicationForBase(num1, num2, base));
    }

    public static int getMultiplicationForBase(int num1, int num2, int base) {
        int ans = 0;
        int multiplier = 1;
        while (num2 != 0) {
            int num2Digit = num2 % 10;

            int product = getMultiplicationForBaseSingleDigit(num1, num2Digit, base);
            product = product * multiplier;
            ans = getSumForBase2(ans, product, base);

            num2 = num2 / 10;
            multiplier = multiplier * 10;
        }

        return ans;
    }

    public static int getMultiplicationForBaseSingleDigit(int num, int digit, int base) {
        int ans = 0;
        int carry = 0;
        int multiplier = 1;

        while (num != 0 || carry != 0) {
            int numDigit = num % 10;
            int product = numDigit * digit + carry;

            int ansDigit = product % base;
            ans = ans + (ansDigit * multiplier);
            carry = product / base;

            num = num / 10;
            multiplier = multiplier * 10;
        }

        return ans;
    }

    public static int getSumForBase2 (int num1, int num2, int base) { // Added 2 in name just for distinction
        int carry = 0;
        int ans = 0;
        int multiplier = 1; // power
        while (num1 != 0 || num2 != 0 || carry != 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int sum = digit1 + digit2 + carry;

            int ansDigit = sum % base;
            ans = ans + (ansDigit * multiplier);
            carry = sum / base;

            num1 = num1 / 10;
            num2 = num2 / 10;
            multiplier = multiplier * 10;
        }

        return ans;
    }
}
