package gettingstarted;

import java.util.Scanner;

public class A12DigitsOfANumber {
    public static void main(String[] args) {
        // Assuming I'm running for numbers >= 0. For negative, we just need to do abs. No leading zeros.
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int numOfDigits = getNumOfDigits(num);
        int divisor = (int) Math.pow(10, numOfDigits-1);

        while (divisor != 0) {       // If while (num != 0) is done it will miss ending zeros in numbers like 720
            int digit = num / divisor;
            System.out.println(digit);

            num = num % divisor;
            divisor = divisor / 10;
        }
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
