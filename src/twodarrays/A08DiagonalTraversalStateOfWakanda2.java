package twodarrays;

import java.util.Scanner;

public class A08DiagonalTraversalStateOfWakanda2 {
    public static void main(String[] args) {
        // 1 <= n <= 10^2
        // Only upper diagonal
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int startColumn = 0; startColumn < n; startColumn++) {
            for (int row = 0, currentColumn = startColumn; row < n - startColumn; row++, currentColumn++) {
                System.out.println(arr[row][currentColumn]);
            }
        }

//        printDiagonalTraversalTheirs(arr);
    }

    private static void printDiagonalTraversalTheirs(int[][] arr) {
        // think like 0 gap diagonal, 1 gap diagonal (bw i and j) and so on.
        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = gap; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
