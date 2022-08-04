package functionsandarray;

import java.util.Scanner;

public class A12SpanOfArray {
    public static void main(String[] args) {
        // 1 <= n <= 10^4
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int maximum = arr[0];
        int minimum = arr[0];

        for (int element : arr) {
            if (element > maximum) {
                maximum = element;
            }

            if (element < minimum) {
                minimum = element;
            }
        }

        System.out.println(maximum - minimum);
    }
}
