package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A04NextGreaterElementOnTheRight_03Alternative {
    public static void main(String[] args) {
        // Vid 110
        // IYKYK type of algo
        // 1. Pop and Answer in same step
        // 2. Push
        // Just watch the video to see simulation
        // Imp thing is to not put the value in the stack but to put the position of the element

        // Now we know nge on right working from r to l and l to r
        // Now think nse on right
        // nge on left
        // nse on left
        // All are similar

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i = 1; i < n; i++) {
            while (!st.empty() && arr[i] >= arr[st.peek()]) {
                int idx = st.pop();
                nge[idx] = arr[i];
            }

            st.push(i);
        }

        while (!st.empty()) {
            int idx = st.pop();
            nge[idx] = -1;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nge[i]);
        }
    }
}
