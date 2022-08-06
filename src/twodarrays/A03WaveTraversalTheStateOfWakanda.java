package twodarrays;

import java.util.Scanner;

public class A03WaveTraversalTheStateOfWakanda {
    public static void main(String[] args) {
        // Can also write two different for loops in if else
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j % 2 == 0) {
                    System.out.println(arr[i][j]);
                } else {
                    System.out.println(arr[arr.length - i - 1][j]);
                }
            }
        }
    }
}
