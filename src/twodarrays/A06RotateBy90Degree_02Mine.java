package twodarrays;

import java.util.Scanner;

public class A06RotateBy90Degree_02Mine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int topRow = 0;
        int bottomRow = arr.length - 1;
        int leftColumn = 0;
        int rightColumn = arr[0].length - 1;

        while (topRow < bottomRow) {
            for (int i = 0; i <= bottomRow-topRow-1; i++) {
                // I'll improve it once I learn about collections like Pair or something
                int firstCoordinateRow = topRow;
                int firstCoordinateCol = leftColumn + i;
                int secondCoordinateRow = topRow + i;
                int secondCoordinateCol = rightColumn;
                int thirdCoordinateRow = bottomRow;
                int thirdCoordinateCol = rightColumn - i;
                int fourthCoordinateRow = bottomRow - i;
                int fourthCoordinateCol = leftColumn;

                int temp = arr[firstCoordinateRow][firstCoordinateCol];
                arr[firstCoordinateRow][firstCoordinateCol] = arr[fourthCoordinateRow][fourthCoordinateCol];
                arr[fourthCoordinateRow][fourthCoordinateCol] = arr[thirdCoordinateRow][thirdCoordinateCol];
                arr[thirdCoordinateRow][thirdCoordinateCol] = arr[secondCoordinateRow][secondCoordinateCol];
                arr[secondCoordinateRow][secondCoordinateCol] = temp;
            }

            topRow++;
            bottomRow--;
            leftColumn++;
            rightColumn--;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
