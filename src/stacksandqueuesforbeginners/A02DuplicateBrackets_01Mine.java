package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A02DuplicateBrackets_01Mine {
    public static void main(String[] args) {
        // Assumption is that brackets are balanced i.e. the opening and closing brackets match with each other
        // Keep pushing every character in stack.
        // When you see closing bracket keep popping till you see opening bracket
        // If there is nothing else apart from opening bracket to pop then there are duplicate brackets.

        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();

        Stack<Character> st = new Stack<>();

        boolean hasDuplicateBrackets = false;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == ')') {
                int popCount = 0;
                while (!st.empty() && st.peek() != '(') {
                    st.pop();
                    popCount++;
                }

                if (popCount == 0) {
                    hasDuplicateBrackets = true;
                    System.out.println("true");
                    break;
                }

                st.pop();
            } else {
                st.push(expression.charAt(i));
            }
        }
         if(!hasDuplicateBrackets)
            System.out.println("false");
    }
}
