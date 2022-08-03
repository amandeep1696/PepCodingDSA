package gettingstarted;

import java.util.Scanner;

public class A09PrintAllPrimesTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int num = low; num <= high; num++) {
            boolean flag = true;

            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println(num);
            }
        }
    }
}
