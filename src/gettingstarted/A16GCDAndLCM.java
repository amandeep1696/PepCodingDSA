package gettingstarted;

import java.util.Scanner;

public class A16GCDAndLCM {
    public static void main(String[] args) {
        // Number between 2 and 10^9. In interview clarify about zeros and negatives.
        // Bruteforce for GCD. Loop from smaller number towards 1. If anything divides both its GCD.
        // GCD method. Keep dividing bigger number (dividend) with smaller number (divisor)
        // In next step, remainder becomes divisor and original divisor becomes dividend.
        // The divisor which can evenly divide the dividend (remainder zero) is the GCD.
        // Example 24 and 36. 24 divides 36 remainder is 12. Next step 12 divides 24 remainder is 0.
        // 12 is GCD.
        // Technically in implementation it does not matter if you start dividing by smaller number.
        // It fixes automatically in one step. Example 36 divides 24 gives remainder 24.
        // Then remainder becomes next divisor and original divisor becomes dividend. So 24 divides 36 and continue.
        // LCM can be calculated from the property that GCD * LCM = n1 * n2
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int gcd = getGCD(n1, n2);
        int lcm = (n1 * n2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int getGCD(int n1, int n2) {
        while (n1 % n2 != 0) {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        return n2;
    }
}
