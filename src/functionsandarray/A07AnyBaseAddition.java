package functionsandarray;

import java.util.Scanner;

public class A07AnyBaseAddition {
    public static void main(String[] args) {
        // Base is between 2 and 10 inclusive. Otherwise, alphabets would have come into play.
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        System.out.println(getSumForBase(num1, num2, base));
    }

    public static int getSumForBase (int num1, int num2, int base) {
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
