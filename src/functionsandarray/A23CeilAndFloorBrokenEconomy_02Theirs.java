package functionsandarray;

import java.util.Scanner;

public class A23CeilAndFloorBrokenEconomy_02Theirs {
    public static void main(String[] args) {
        // Their solution does not handle the case if d is outside the limits of array.
        // I guess you can say if d > biggest val in array then ceil is Integer.MAX_VALUE and vice versa.
        // I like my solution better. Did normal binary search. Checked the ending behaviour on 2 elements.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int ceil = Integer.MAX_VALUE;
        int floor =  Integer.MIN_VALUE;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(data > arr[mid]) {
                left = mid + 1;
                floor = arr[mid];
            } else if(data < arr[mid]) {
                right = mid - 1;
                ceil = arr[mid];
            } else {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}
