package twodarrays;

import java.util.Scanner;

public class A10SearchInASorted2DArray {
    public static void main(String[] args) {
        // 1 <= n <= 10^2
        // All rows and columns are sorted in increasing order
        // "Not Found" if element is not in the matrix
        // Normal linear search O(m * n)
        // This approach O(m + n)
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();

        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            int currentElement = arr[row][col];

            if (currentElement == x) {
                System.out.println(row);
                System.out.println(col);
                return;
            } else if (currentElement < x) {
                row++;
            } else {
                col--;
            }
        }

        System.out.println("Not Found");
    }
}
