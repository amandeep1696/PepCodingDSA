package twodarrays;

import java.util.Scanner;

public class A04SpiralDisplayTraversal_02Theirs {
    public static void main(String[] args) {
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
        int totalElements = n * m;
        int cnt = 0;

        while (cnt < totalElements) {
            for (int row = topRow; row <= bottomRow && cnt < totalElements; row++) {
                System.out.println(arr[row][leftColumn]);
                cnt++;
            }
            leftColumn++;

            for (int column = leftColumn; column <= rightColumn && cnt < totalElements; column++) {
                System.out.println(arr[bottomRow][column]);
                cnt++;
            }
            bottomRow--;

            for (int row = bottomRow; row >= topRow && cnt < totalElements; row--) {
                System.out.println(arr[row][rightColumn]);
                cnt++;
            }
            rightColumn--;

            for (int column = rightColumn; column >= leftColumn && cnt < totalElements; column--) {
                System.out.println(arr[topRow][column]);
                cnt++;
            }
            topRow++;
        }
    }
}
