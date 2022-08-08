package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A12FirstIndexOfOccurrence {
    public static void main(String[] args) {
        // 1 <= n <= 10^4
        // 0 <= n1, n2, .. n elements <= 10 ^ 3
        // 0 <= x <= 10 ^ 3

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();

        System.out.println(getFirstIndex(arr, 0, x));
    }

    private static int getFirstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        int firstIndexInRight = getFirstIndex(arr, idx + 1, x);
        if (arr[idx] == x) {
            return idx;
        } else {
            return firstIndexInRight;
        }
    }

    private static int getFirstIndexBetter(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == x) {
            return idx; // Don't need to go deeper. Can return on first occurrence of x.
        } else {
            return getFirstIndexBetter(arr, idx + 1, x);
        }
    }
}
