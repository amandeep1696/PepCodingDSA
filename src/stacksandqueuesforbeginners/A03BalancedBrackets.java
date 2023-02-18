package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A03BalancedBrackets {
    public static void main(String[] args) {
        // Could be mismatch like {]
        // Could be more opening brackets than closing
        // Could be more closing brackets than opening
        // If none of these cases then balanced
        // They have written code in a different way. You can check their video once but I like mine better.
        // Hence not coding up their version as mine is cleaner and looks less repetitive.

        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();

        Stack<Character> st = new Stack<>();
        boolean areBalanced = true;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (isOpeningBracket(ch)) {
                st.push(ch);
            } else if (isClosingBracket(ch)) {
                if (st.empty()) {
                    areBalanced = false;
                    break;
                }
                char openingBracket = st.pop();
                if (!areMatchingPairBrackets(openingBracket, ch)) {
                    areBalanced = false;
                    break;
                }
            }
        }

        System.out.println(areBalanced && st.empty());
    }

    private static boolean isOpeningBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private static boolean isClosingBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }

    private static boolean areMatchingPairBrackets(char openingBracket, char closingBracket) {
        return (openingBracket == '(' && closingBracket == ')') || (openingBracket == '{' && closingBracket == '}') || (openingBracket == '[' && closingBracket == ']');
    }
}
