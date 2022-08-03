package patterns;

import java.util.Scanner;

public class A16Pattern16_01Mine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();

        // int numCols = (2 * numRows) - 1;
        // int numOfValuesToPrint = 2;

        int numOfTabs = (2 * numRows) - 3;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int j = 1; j <= numOfTabs; j++) {
                System.out.print("\t");
            }

            int startVal;
            if (i == numRows) {
                startVal = i - 1;
            }
            else {
                startVal = i;
            }

            for (int j = startVal; j > 0; j--) {
                System.out.print(j + "\t");
            }

            System.out.println();
            numOfTabs -= 2;
        }
    }
}
