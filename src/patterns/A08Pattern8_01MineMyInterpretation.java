package patterns;

import java.util.Scanner;

public class A08Pattern8_01MineMyInterpretation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int numOfTabs = n - 1; numOfTabs >= 0; numOfTabs--) {
            for (int j = 1; j <= numOfTabs; j++) {
                System.out.print("\t");
            }
            System.out.println("*\t");
        }
    }
}
