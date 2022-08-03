package gettingstarted;

import java.util.Scanner;

public class A14InverseOfANumber_Sumeet {
    public static void main(String[] args) {
        // Doing just for positive numbers > 0.
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int inverseNumber = 0;
        int originalIndex = 1;

        while (num != 0) {
            int originalDigit = num % 10;
            int invertedDigit = originalIndex;
            int invertedIndex = originalDigit;
            int multipleOfTen = (int) Math.pow(10, invertedIndex-1);
            inverseNumber = inverseNumber + (invertedDigit * multipleOfTen);

            originalIndex++;
            num = num / 10;
        }

        System.out.println(inverseNumber);
    }
}
