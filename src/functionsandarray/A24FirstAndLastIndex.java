package functionsandarray;

import java.util.Scanner;

public class A24FirstAndLastIndex {
    public static void main(String[] args) {
        // 1 <= n <= 1000. Array is sorted. It may have duplicate values.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();

        // Let the binary search work till completion. Keep track of potential answer.
        int firstIndex = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if(d > arr[mid]) {
                lo = mid + 1;
            } else if (d < arr[mid]) {
                hi = mid - 1;
            } else {
                firstIndex = mid;
                hi = mid - 1;
            }
        }

        int lastIndex = -1;
        lo = 0;
        hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if(d > arr[mid]) {
                lo = mid + 1;
            } else if (d < arr[mid]) {
                hi = mid - 1;
            } else {
                lastIndex = mid;
                lo = mid + 1;
            }
        }

        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }
}
