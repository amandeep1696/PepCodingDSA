package gettingstarted;

import java.util.Scanner;

public class A13ReverseANumber {
    public static void main(String[] args) {
        // Doing just for positive numbers > 0.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            System.out.println(digit);
        }
    }
}
