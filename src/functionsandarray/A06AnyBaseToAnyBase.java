package functionsandarray;

import java.util.Scanner;

public class A06AnyBaseToAnyBase {
    public static void main(String[] args) {
        // Can't directly convert from any base to any base
        // First go from any base to decimal
        // Then go from decimal to any base
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();
        int targetBase = scn.nextInt();

        System.out.println(getAnyBaseToAnyBase(number, base, targetBase));
    }

    public static int getAnyBaseToAnyBase (int number, int base, int targetBase) {
        int decimalNumberFromSourceBase = getAnyBaseToDecimal(number, base);
        int targetBaseNumberFromDecimal = getDecimalToAnyBase(decimalNumberFromSourceBase, targetBase);

        return targetBaseNumberFromDecimal;
    }

    public static int getAnyBaseToDecimal (int number, int base) {
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

    public static int getDecimalToAnyBase (int decimalNumber, int targetBase) {
        int targetNumber = 0;
        int multiplier = 1;
        while (decimalNumber > 0) {
            int remainder = decimalNumber % targetBase;
            targetNumber = targetNumber + (remainder * multiplier);

            decimalNumber = decimalNumber / targetBase;
            multiplier = multiplier * 10;
        }

        return targetNumber;
    }
}
