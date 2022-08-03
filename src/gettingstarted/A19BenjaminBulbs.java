package gettingstarted;

import java.util.Scanner;

public class A19BenjaminBulbs {
    public static void main(String[] args) {
        // Can write down for a case like 20, and you'll see that only perfect squares remain on.
        // If a number has even number of factors, then it is toggled even number of times. It remains off.
        // Only perfect squares have odd number of factors. Hence, they remain on.
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for(int i = 1; i * i <= num; i++) {
            System.out.println(i * i);
        }
    }
}
