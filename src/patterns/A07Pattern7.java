package patterns;

import java.util.Scanner;

public class A07Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int numOfTabs = 0; numOfTabs < n; numOfTabs++) {
            for (int j = 1; j <= numOfTabs; j++) {
                System.out.print("\t");
            }
            System.out.println("*\t");
        }
    }
}
