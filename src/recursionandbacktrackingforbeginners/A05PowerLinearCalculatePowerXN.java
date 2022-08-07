package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A05PowerLinearCalculatePowerXN {
    public static void main(String[] args) {
        // 1 <= x <= 10
        // 0 <= n <= 9
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int power = scn.nextInt();
        System.out.println(getPowerLinear(num, power));
    }

    private static int getPowerLinear(int num, int power) {
        if (power == 0) {
            return 1;
        }
        return num * getPowerLinear(num, power - 1);
    }
}
