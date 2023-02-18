package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A07SlidingWindowMaximum {
    public static void main(String[] args) {
        //  You are required to find and print the maximum element in every window of size k.
        //e.g.
        //for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4,
        // the answer is [9 9 8 12 12 14 14 32 32 32 32 19 19 19]
        // 0 <= n < 100000
        //-10^9 <= a[i] <= 10^9
        //0 < k < n
        // Im not checking n = 0 case
        // Hint is to use NGE
        // First calculate NGE on right for each element.
        // If no NGE exists then put arr.length instead of -1. This eases logic checking later.
        // that  J < I condition is very important to keep the time complexity O(n)
        // otherwise in case of ascending order array the time complexity will be O(n*k).
        // Just watch video solution. Can't explain more here.

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int[] ngeRightIndices = getNgeRightIndices(arr);

        int greatestWindowElementIndex = 0;
        for (int windowStartIndex = 0; windowStartIndex <= n - k; windowStartIndex++) {
            if (greatestWindowElementIndex < windowStartIndex) {
                greatestWindowElementIndex = windowStartIndex;
            }

            while(ngeRightIndices[greatestWindowElementIndex] < windowStartIndex + k) {
                greatestWindowElementIndex = ngeRightIndices[greatestWindowElementIndex];
            }

            System.out.println(arr[greatestWindowElementIndex]);
        }
    }

    private static int[] getNgeRightIndices(int[] arr) {
        int[] ngeRightIndices = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        ngeRightIndices[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.empty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (!st.empty()) {
                ngeRightIndices[i] = st.peek();
            } else {
                ngeRightIndices[i] = arr.length;
            }

            st.push(i);
        }

        return ngeRightIndices;
    }
}
