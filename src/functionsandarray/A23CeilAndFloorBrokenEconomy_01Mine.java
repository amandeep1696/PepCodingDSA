package functionsandarray;

import java.util.Scanner;

public class A23CeilAndFloorBrokenEconomy_01Mine {
    public static void main(String[] args) {
        // 1 <= n <= 1000
        // 0---4.   bw 2 and 3.  mid = 2   lo = 3 hi = 4   mid = 3   lo = 3, hi = 2
        // Two numbers 0 and 1  bw 0 and 1   mid will always be lo.  lo = mid+1  lo = 1, hi = 1. Next step hi = 0.
        // lo stops at ceil. hi stops at floor.
        // If d equal to lo or hi it would have been found and printed.
        // Two numbers 0 and 1   Greater than 1.   mid = 0  lo = mid+1  lo = 1 hi = 1. Next step lo = 2 hi = 1.
        // Two numbers 0 and 1   Less than 0       mid = 0  hi = mid - 1   lo = 0 hi = -1.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();

        int lo = 0;
        int hi = arr.length-1;

        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if (arr[mid] == d) {
                System.out.println(arr[mid]);
                System.out.println(arr[mid]);
                return;
            } else if (arr[mid] < d) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        if (lo == 0) {
            System.out.println(arr[lo]);
            System.out.println(arr[lo]);
        } else if (lo == arr.length) {
            System.out.println(arr[hi]);
            System.out.println(arr[hi]);
        } else {
            System.out.println(arr[lo]); // ceil
            System.out.println(arr[hi]); // floor
        }
    }
}
