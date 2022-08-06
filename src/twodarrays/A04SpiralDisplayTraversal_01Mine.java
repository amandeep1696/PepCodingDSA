package twodarrays;

import java.util.Scanner;

public class A04SpiralDisplayTraversal_01Mine {
    public static void main(String[] args) {
        // Spiral starts going down first
        // Corner cases are 1 2 and 1
        //                          2
        // Only the bottom two for loops need to be checked for these corner cases
        // Going box by box.
        /*
        Last box could be |          or |      or  _________
                          |             |
                          |______       |
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int topRow = 0;
        int bottomRow = arr.length - 1;
        int leftColumn = 0;
        int rightColumn = arr[0].length - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            for (int row = topRow; row <= bottomRow; row++) {
                System.out.println(arr[row][leftColumn]);
            }
            leftColumn++;

            for (int column = leftColumn; column <= rightColumn; column++) {
                System.out.println(arr[bottomRow][column]);
            }
            bottomRow--;

            if (topRow <= bottomRow && leftColumn <= rightColumn) {
                for (int row = bottomRow; row >= topRow; row--) {
                    System.out.println(arr[row][rightColumn]);
                }
                rightColumn--;
            }

            if (topRow <= bottomRow && leftColumn <= rightColumn) {
                for (int column = rightColumn; column >= leftColumn; column--) {
                    System.out.println(arr[topRow][column]);
                }
                topRow++;
            }
        }
    }
}
