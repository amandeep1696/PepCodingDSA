package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A02DuplicateBrackets_02Theirs {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ')') {
                if(st.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while(st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

        System.out.println(false);
    }
}
