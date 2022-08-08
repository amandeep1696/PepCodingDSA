package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A11MaxOfAnArray {
    public static void main(String[] args) {
        // 1 <= n <= 10^4
        // 0 <= n1, n2, .. n elements <= 10 ^9
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(getMaxOfArrayTheirs(arr, 0));
    }

    private static int getMaxOfArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return Integer.MIN_VALUE;
        }
        int maxRestOfTheArray = getMaxOfArray(arr, idx + 1);
        if (maxRestOfTheArray > arr[idx]) {
            return maxRestOfTheArray;
        } else {
            return arr[idx];
        }
    }

    private static int getMaxOfArrayTheirs(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int maxRestOfTheArray = getMaxOfArrayTheirs(arr, idx + 1);
        return Math.max(maxRestOfTheArray, arr[idx]);
    }
}
