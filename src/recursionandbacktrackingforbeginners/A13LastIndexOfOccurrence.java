package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A13LastIndexOfOccurrence {
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

        //System.out.println(getLastIndex(arr, arr.length - 1, x));
        System.out.println(getLastIndexTheirsNotBetter(arr, 0, x));
    }

    private static int getLastIndex(int[] arr, int idx, int x) {
        if (idx < 0) {
            return -1;
        }

        if (arr[idx] == x) {
            return idx;
        } else {
            return getLastIndex(arr, idx-1, x);
        }
    }

    private static int getLastIndexTheirsNotBetter(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        int lastIndexInRestArray = getLastIndexTheirsNotBetter(arr, idx + 1, x);

        if (lastIndexInRestArray == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return lastIndexInRestArray;
        }
    }
}
