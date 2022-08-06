package twodarrays;

import java.util.Scanner;

public class A06RotateBy90Degree_03Theirs {
    public static void main(String[] args) {
        // 1 <= n <= 10^2
        // Transpose makes first row to first column, second row to second column and so on.
        // Do transpose then reverse the columns. So switch first and last column, second and second last col and so on.
        // Basically do the transpose then row by row reverse each row.
        // For transpose put i,j in j,i and vice versa.
        // Transpose basically just means to reverse across the diagonal.
        // Make sure to run transpose code only in one triangle.
        // Running in whole matrix will just keep the matrix in original state because swaps will happen twice.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        transposeMatrix(arr);

        /*for (int row = 0; row < arr.length; row++) {
            reverseArray(arr[row]);
        }*/

        for (int[] row : arr) {
            reverseArray(row);
        }

        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void transposeMatrix(int[][] arr) {
        // Transpose works for square matrix only
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    private static void reverseArray(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
    }
}
