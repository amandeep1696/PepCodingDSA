package functionsandarray;

import java.util.Scanner;

public class A14BarChart {
    public static void main(String[] args) {
        // 1 <= n <= 30
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int maxElement = getMaxElementInArray(arr);
        for (int height = maxElement; height > 0; height--) {
            for (int barHeight : arr) {
                if (barHeight >= height ) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static int getMaxElementInArray(int[] arr) {
        int maxElement = arr[0];
        for (int element : arr) {
            if (maxElement < element) {
                maxElement = element;
            }
        }

        return  maxElement;
    }
}
