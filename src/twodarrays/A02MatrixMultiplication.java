package twodarrays;

import java.util.Scanner;

public class A02MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] arr2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        if (m1 != n2) {
            System.out.println("Invalid input");
            return;
        }

        for (int matrix1Row = 0; matrix1Row < arr1.length; matrix1Row++) {
            for (int matrix2Col = 0; matrix2Col < arr2[0].length; matrix2Col++) {
                int product = 0;
                for (int index = 0; index < arr1[0].length; index++) {
                    int num1 = arr1[matrix1Row][index];
                    int num2 = arr2[index][matrix2Col];
                    product = product + (num1 * num2);
                }
                System.out.print(product + " ");
            }
            System.out.println();
        }
    }
}
