package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A06LargestAreaHistogram {
    public static void main(String[] args) {
        // You are required to
        // find and print the area of largest
        // rectangle in the histogram. e.g. for the array [6 2 5 4 5 1 6] -> 12
        // 0 <= n < 20 0 <= a[i] <= 10
        // Inefficient solution is to consider each bar as height and move left and right to find length of rect
        // I can see we can use nseLeft and nseRight indices to get answer
        // I'll calculate these individually and then get answer
        // Also watch sol vid. They consider rb arrLength if its not there. lb as -1 if its not there
        // Then length = rb-lb-1 always.
        // Ignore his < sign in video. It should be <=. Their nados sol is correct.

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] nextSmallerElementRightIndices = getNextSmallerElementRightIndices(arr);
        int[] nextSmallerElementLeftIndices = getNextSmallerElementLeftIndices(arr);

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int height = arr[i];
            int leftLength = (nextSmallerElementLeftIndices[i] != -1) ? i - nextSmallerElementLeftIndices[i] - 1 : i;
            int rightLength = (nextSmallerElementRightIndices[i] != -1) ? nextSmallerElementRightIndices[i] - i - 1  : n - i - 1;
            int length = leftLength + rightLength + 1;
            int currentArea = length * height;

            if(currentArea > maxArea) {
                maxArea = currentArea;
            }
        }

        System.out.println(maxArea);
    }

    private static int[] getNextSmallerElementRightIndices(int[] arr) {
        int arrLength = arr.length;
        int[] nextSmallerElementRightIndices = new int[arrLength];
        Stack<Integer> st = new Stack<>();

        nextSmallerElementRightIndices[arrLength - 1] = -1;
        st.push(arrLength - 1);

        for (int i = arrLength - 2; i >= 0; i--) {
            while(!st.empty() && arr[i] <= arr[st.peek()]) {  // <= is important. Think case 1, 1.
                st.pop();
            }

            if(!st.empty()) {
                nextSmallerElementRightIndices[i] = st.peek();
            } else {
                nextSmallerElementRightIndices[i] = -1;
            }

            st.push(i);
        }

        return nextSmallerElementRightIndices;
    }

    private static int[] getNextSmallerElementLeftIndices(int[] arr) {
        int arrLength = arr.length;
        int[] nextSmallerElementLeftIndices = new int[arrLength];
        Stack<Integer> st = new Stack<>();

        nextSmallerElementLeftIndices[0] = -1;
        st.push(0);

        for (int i = 1; i < arrLength; i++) {
            while(!st.empty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if(!st.empty()) {
                nextSmallerElementLeftIndices[i] = st.peek();
            } else {
                nextSmallerElementLeftIndices[i] = -1;
            }

            st.push(i);
        }

        return nextSmallerElementLeftIndices;
    }
}
