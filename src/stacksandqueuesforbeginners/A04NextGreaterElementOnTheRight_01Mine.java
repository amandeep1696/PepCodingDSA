package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A04NextGreaterElementOnTheRight_01Mine {
    public static void main(String[] args) {
        // "Next greater element on the right" of an element x is defined as the first element to right of x
        // having value greater than x.
        //Note -> If an element does not have any element on it's right side greater than it,
        // consider -1 as it's "next greater element on right"
        // 0 <= n < 10^5
        //-10^9 <= a[i] <= 10^9
        // Im assuming 1 <= n <= 10^5 and not checking for 0

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--) {
            if (st.empty()) {
                ans[i] = -1;
            } else {
                while(!st.empty() && st.peek() <= arr[i]) { // <= is very imp
                    st.pop();
                }

                if (st.empty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }

            st.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}
