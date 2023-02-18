package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A08InfixEvaluation_02Modular {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                operands.push(Character.getNumericValue(ch)); // Can also do operands.push(ch - '0')
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    doOperation(operands, operators);
                }

                operators.pop(); // To pop '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.empty()
                        && operators.peek() != '('
                        && getPrecedence(ch) <= getPrecedence(operators.peek())) {
                    doOperation(operands, operators);
                }

                operators.push(ch);
            }
        }

        while (!operators.empty()) {
            doOperation(operands, operators);
        }

        System.out.println(operands.peek());
    }

    private static int getPrecedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    private static int getOperationResult(int operand1, int operand2, char operator) {
        if (operator == '+') {
            return operand1 + operand2;
        } else if (operator == '-') {
            return operand1 - operand2;
        } else if (operator == '*') {
            return operand1 * operand2;
        } else {
            return operand1 / operand2;
        }
    }

    private static void doOperation(Stack<Integer> operands, Stack<Character> operators) {
        char operator = operators.pop();
        int operand2 = operands.pop();
        int operand1 = operands.pop();

        int result = getOperationResult(operand1, operand2, operator);
        operands.push(result);
    }
}
