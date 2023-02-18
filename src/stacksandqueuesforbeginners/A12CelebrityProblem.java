package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A12CelebrityProblem {
    public static void main(String[] args) {
        // 1. You are given a number n, representing the number of people in a party.
        //2. You are given n strings of n length containing 0's and 1's
        //3. If there is a '1' in ith row, jth spot, then person i knows about person j.
        //4. A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.
        //5. If there is a celebrity print it's index otherwise print "none".
        //
        //Note -> There can be only one celebrity. Think why?

        // 1 <= n <= 10^4
        //e1, e2, .. n * n elements belongs to the set (0, 1)

        // Brute force seems like consider every index and see if its row has all 0s and column all 1s.
        // Diagonal elements dont matter

        // Watch vid for simulation of approach. Very cool.
        // Since at max there can be one celebrity
        // Just make stack of all and keep checking top two and keep elimination one
        // E.g if we have 3 and 4.  If arr[3][4] = 0 then 4 cant be celeb
        // and if arr[3][4] = 1 then 3 cant be celeb
        // At end whatever remains just check its complete row and column to check if its celeb or not

        // LC has O(1) space sol. We'll see it when the time is right.

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int person1 = st.pop();
            int person2 = st.pop();

            if (arr[person1][person2] == 1) {
                st.push(person2);
            } else {
                st.push(person1);
            }
        }

        int celebCandidateIndex = st.pop();
        boolean isCeleb = true;

        for (int i = 0; i < n; i++) {
            if (i != celebCandidateIndex) {
                if (arr[celebCandidateIndex][i] == 1 || arr[i][celebCandidateIndex] == 0) {
                    isCeleb = false;
                    break;
                }
            }
        }

        System.out.println((isCeleb) ? celebCandidateIndex : "none");
    }
}
