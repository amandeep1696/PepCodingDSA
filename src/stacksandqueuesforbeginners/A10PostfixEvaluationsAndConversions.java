package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A10PostfixEvaluationsAndConversions {
    public static void main(String[] args) {
        // 1. You are given a postfix expression.
        //2. You are required to evaluate it and print it's value.
        //3. You are required to convert it to infix and print it.
        //4. You are required to convert it to prefix and print it.
        //
        //Note -> Use brackets in infix expression for indicating precedence.

        // 1. Expression is a valid postfix expression
        //2. The only operators used are +, -, *, /
        //3. All operands are single digit numbers.

        // Evaluation of postfix and conversion of postfix to infix or prefix is a very similar process
        // Basically the evaluation process flow is used for conversion as well

        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();

        Stack<Integer> postfixOperands = new Stack<>();

        Stack<String> infixConvertedOperands = new Stack<>();
        Stack<String> prefixConvertedOperands = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                postfixOperands.push(ch - '0');
                infixConvertedOperands.push(String.valueOf(ch));
                prefixConvertedOperands.push(String.valueOf(ch));
            } else {
                int secondOperand = postfixOperands.pop();
                int firstOperand = postfixOperands.pop();
                int result = getArithmeticOperationResult(firstOperand, secondOperand, ch);

                postfixOperands.push(result);

                doInfixConversionOperation(infixConvertedOperands, ch);
                doPrefixConversionOperation(prefixConvertedOperands, ch);
            }
        }

        System.out.println(postfixOperands.peek());
        System.out.println(infixConvertedOperands.peek());
        System.out.println(prefixConvertedOperands.peek());
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
        String secondOperand = infixConvertedOperands.pop();
        String firstOperand = infixConvertedOperands.pop();

        String result = "("
                .concat(firstOperand)
                .concat(String.valueOf(operator))
                .concat(secondOperand)
                .concat(")");

        infixConvertedOperands.push(result);
    }

    private static void doPrefixConversionOperation(Stack<String> prefixConvertedOperands, char operator) {
        String secondOperand = prefixConvertedOperands.pop();
        String firstOperand = prefixConvertedOperands.pop();

        String result = String.valueOf(operator)
                .concat(firstOperand)
                .concat(secondOperand);

        prefixConvertedOperands.push(result);
    }
}
