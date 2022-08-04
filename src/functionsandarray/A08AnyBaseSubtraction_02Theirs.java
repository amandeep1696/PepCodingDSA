package functionsandarray;

import java.util.Scanner;

public class A08AnyBaseSubtraction_02Theirs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        System.out.println(getSubtractionForBaseTheirs(num1, num2, base));
    }

    public static int getSubtractionForBaseTheirs(int num1, int num2, int base) {
        int ans = 0;
        int multiplier = 1;
        int borrow = 0;
        while (num2 != 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int ansDigit = 0;
            digit2 = digit2 + borrow;

            if(digit2 >= digit1) {
                borrow = 0;
                ansDigit = digit2 - digit1;
            } else {
                borrow = -1;
                ansDigit = digit2 + base - digit1;
            }

            ans = ans + (ansDigit * multiplier);

            num1 = num1 / 10;
            num2 = num2 / 10;
            multiplier = multiplier * 10;
        }

        return ans;
    }
}
