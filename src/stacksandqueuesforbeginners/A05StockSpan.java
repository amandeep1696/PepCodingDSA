package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A05StockSpan {
    public static void main(String[] args) {
        // Stock span is defined as the number of days passed between the current day
        // and the first day before today when price was higher than today.
        // 0 <= n < 10^5
        //-10^9 <= a[i] <= 10^9
        // Im assuming 1 <= n <= 10^5. Not checking 0 case.
        // e.g.
        //for the array [2 5 9 3 1 12 6 8 7]
        //span for 2 is 1
        //span for 5 is 2
        //span for 9 is 3
        //span for 3 is 1
        //span for 1 is 1
        //span for 12 is 6
        //span for 6 is 1
        //span for 8 is 2
        //span for 7 is 1
        // See question vid. See sunlight example to understand what is span.
        // Span = Idx of element - Idx of NGE on left.
        // If no NGE on left then Span = Idx of element + 1
        // I basically just converted NGE on left program to Stock Span program.

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] stockSpan = new int[n]; //int[] ngeLeft = new int[n];
        Stack<Integer> st = new Stack<>();

        stockSpan[0] = 1; //ngeLeft[0] = -1;
        st.push(0); //st.push(arr[0]);

        for(int i = 1; i < n; i++) {
            //while (!st.empty() && arr[i] > st.peek()) {
            //    st.pop();
            //}

            while (!st.empty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            //if(!st.empty()) {
            //    ngeLeft[i] = st.peek();
            //} else {
            //    ngeLeft[i] = -1;
            //}

            if(!st.empty()) {
                stockSpan[i] = i - st.peek();
            } else {
                stockSpan[i] = i + 1;
            }

            st.push(i); //st.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(stockSpan[i]); //System.out.println(ngeLeft[i]);
        }
    }
}
