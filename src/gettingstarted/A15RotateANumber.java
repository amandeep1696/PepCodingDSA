package gettingstarted;

import java.util.Scanner;

public class A15RotateANumber {
    public static void main(String[] args) {
        // Rotation can be dune by getting the right divisor and multiplier for the number
        // Example if 25398 is to be positive rotated by 2, it will become 98253
        // Divisor will be 100 and multiplier will be 1000. 25398 / 100 = 253. 25398 % 100 = 98.
        // 98 * 1000 = 98000. Ans = 98000 + 253 = 98253.
        // Example if 273516 is to be positive rotated by 2, it will become 162735
        // Divisor will be 100 and multiplier will be 10000. 273516 / 100 = 2735. 273516 % 100 = 16.
        // 16 * 10000 = 160000. Ans = 160000 + 2735 = 162735.
        // Take care of multiple loop rotations using modulus.
        // Negative rotations can be represented in terms of positive rotations.
        // Example for a 5-digit number, -3 rotation is same as +2 rotation.
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();

        int numOfDigits = getNumOfDigits(num);
        int numOfRotations = k % numOfDigits;
        if (numOfRotations < 0) {
            numOfRotations = numOfRotations + numOfDigits;
        }
        int divisor = (int) Math.pow(10, numOfRotations);
        int multiplier = (int) Math.pow(10, numOfDigits-numOfRotations);

        /*
        Alternative logic to get divisor and multiplier

        int divisor = 1;
        int multiplier = 1;
        for (int i = 1; i <= numOfDigits; i++) {
            if (i <= numOfRotations) {
                divisor = divisor * 10;
            } else {
                multiplier = multiplier * 10;
            }
        }
        */

        int quotient = num / divisor;
        int remainder = num % divisor;
        int rotatedNumber = (remainder * multiplier) + quotient;

        System.out.println(rotatedNumber);
    }

    private static int getNumOfDigits(int num) {
        if(num == 0) {
            return 1;
        }

        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
