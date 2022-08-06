package twodarrays;

import java.util.Scanner;

public class A05ExitPointOfAMatrix_01Mine {
    public static void main(String[] args) {
        // I'm assuming he can always exit the matrix
        // 1 <= n <= 10^2
        // 1 <= m <= 10^2
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int row = 0; int col = 0;
        int prevRow = -1; int prevCol = -1;
        int[] deviationRow = {0, 1, 0, -1}; // Ideally I would keep a collection of pairs.
        int[] deviationCol = {1, 0, -1, 0};
        int deviationIndex = 0;
        while (row >= 0 && col >= 0 && row < n && col < m) {
            if (arr[row][col] == 1) {
                deviationIndex = (deviationIndex + 1) % 4; // Ideally I would not hardcode 4
            }

            prevRow = row;
            prevCol = col;
            row = row + deviationRow[deviationIndex];
            col = col + deviationCol[deviationIndex];
        }

        System.out.println(prevRow);
        System.out.println(prevCol);
    }
}
