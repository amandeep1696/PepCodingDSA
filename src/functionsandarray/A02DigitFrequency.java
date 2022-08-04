package functionsandarray;

import java.util.Scanner;

public class A02DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int digit = scn.nextInt();

        int digitFrequency = getDegitFrequency(number, digit);
        System.out.println(digitFrequency);
    }

    public static int getDegitFrequency(int number, int digit) {
        if (number == 0 && digit == 0) {
            return 1;
        }

        int freq = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == digit) {
                freq++;
            }
            number /= 10;
        }

        return freq;
    }
}
