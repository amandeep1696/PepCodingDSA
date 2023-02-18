package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A11PrefixEvaluationsAndConversions {
    public static void main(String[] args) {
        // Its basically the same thing as previous
        // You just need to start traversing from the end
        // And the order of firstOperand and secondOperand is different

        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();

        Stack<Integer> prefixOperands = new Stack<>();

        Stack<String> infixConvertedOperands = new Stack<>();
        Stack<String> postfixConvertedOperands = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                prefixOperands.push(ch - '0');
                infixConvertedOperands.push(String.valueOf(ch));
                postfixConvertedOperands.push(String.valueOf(ch));
            } else {
                int firstOperand = prefixOperands.pop();
                int secondOperand = prefixOperands.pop();
                int result = getArithmeticOperationResult(firstOperand, secondOperand, ch);

                prefixOperands.push(result);

                doInfixConversionOperation(infixConvertedOperands, ch);
                doPostfixConversionOperation(postfixConvertedOperands, ch);
            }
        }

        System.out.println(prefixOperands.peek());
        System.out.println(infixConvertedOperands.peek());
        System.out.println(postfixConvertedOperands.peek());
    }

    private static int getArithmeticOperationResult(int firstOperand, int secondOperand, char operator) {
        if (operator == '+') {
            return firstOperand + secondOperand;
        } else if (operator == '-') {
            return firstOperand - secondOperand;
        } else if (operator == '*') {
            return firstOperand * secondOperand;
        } else {
            return firstOperand / secondOperand;
        }
    }

    private static void doInfixConversionOperation(Stack<String> infixConvertedOperands, char operator) {
        String firstOperand = infixConvertedOperands.pop();
        String secondOperand = infixConvertedOperands.pop();

        String result = "("
                .concat(firstOperand)
                .concat(String.valueOf(operator))
                .concat(secondOperand)
                .concat(")");

        infixConvertedOperands.push(result);
    }

    private static void doPostfixConversionOperation(Stack<String> postfixConvertedOperands, char operator) {
        String firstOperand = postfixConvertedOperands.pop();
        String secondOperand = postfixConvertedOperands.pop();

        String result = firstOperand
                .concat(secondOperand)
                .concat(String.valueOf(operator));

        postfixConvertedOperands.push(result);
    }
}
