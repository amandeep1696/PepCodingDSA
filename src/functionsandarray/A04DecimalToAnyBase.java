package functionsandarray;

import java.util.Scanner;

public class A04DecimalToAnyBase {
    public static void main(String[] args) {
        // Keep dividing by the target base. The multiplier is the original base. Answer in bottom up order.
        Scanner scn = new Scanner(System.in);
        int decimalNumber = scn.nextInt();
        int targetBase = scn.nextInt();

        System.out.println(getValueInBase(decimalNumber, targetBase));
    }

    public static int getValueInBase (int decimalNumber, int targetBase) {
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
