package gettingstarted;

import java.util.Scanner;

public class A14InverseOfANumber_Mine {
    public static void main(String[] args) {
        // Doing just for positive numbers > 0.
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int numOfDigits = getNumOfDigits(num);
        int[] inverseDigits = new int[numOfDigits];
        int currentDigit = 1;

        while (num != 0) {
            int lastDigit = num % 10;
            int pos = numOfDigits - lastDigit;
            inverseDigits[pos] = currentDigit;

            currentDigit++;
            num = num / 10;
        }

        int inverseNumber = getNumFromArr(inverseDigits);
        System.out.println(inverseNumber);
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

    private static int getNumFromArr(int[] digits) {
        int num = 0;
        for(int digit : digits) {
            num = num * 10;
            num = num + digit;
        }
        return num;
    }
}
