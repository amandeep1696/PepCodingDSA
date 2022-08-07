package twodarrays;

import java.util.Scanner;

public class A09SaddlePointSaddlePrice {
    public static void main(String[] args) {
        // 1 <= n <= 10^2
        // Print "Invalid input" if no saddle point is there.
        // There is only one saddle point in a matrix (Think why)
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {
            int minElement = Integer.MAX_VALUE;
            int minElementCol = -1;
            for (int col = 0; col < n; col++) {
                if (arr[row][col] < minElement) {
                    minElement = arr[row][col];
                    minElementCol = col;
                }
            }

            boolean isSaddle = true;
            for (int r = 0; r < n; r++) {
                if (arr[r][minElementCol] > minElement) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println(minElement);
                return;
            }
        }

        System.out.println("Invalid input");
    }
}
