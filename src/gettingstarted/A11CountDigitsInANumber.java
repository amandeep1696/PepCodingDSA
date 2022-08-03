package gettingstarted;

import java.util.Scanner;

public class A11CountDigitsInANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int dig = 0;
        while (n != 0) {
            n /= 10;
            dig++;
        }

        if (dig == 0) {
            System.out.println(1);
        } else {
            System.out.println(dig);
        }
    }
}
