package functionsandarray;

import java.util.Scanner;

public class A05AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();

        System.out.println(getDecimal(number, base));
    }

    public static int getDecimal (int number, int base) {
        int targetNumber = 0;
        int multiplier = 1;

        while (number > 0) {
            int remainder = number % 10;
            targetNumber = targetNumber + (remainder * multiplier);

            number = number / 10;
            multiplier = multiplier * base;
        }

        return targetNumber;
    }
}
