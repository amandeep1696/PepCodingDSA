package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A08InfixEvaluation_01 {
    public static void main(String[] args) {
        // 1. Expression is balanced
        //2. The only operators used are +, -, *, /
        //3. Opening and closing brackets - () - are used to impact precedence of operations
        //4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
        //5. In two operators of equal precedence give preference to the one on left.
        //6. All operands are single digit numbers.
        // Keep two stacks one for operator and one for operand
        // When you see operand push in operand stack
        // When you see opening bracket push in operator stack
        // When you see closing bracket, pop till opening bracket and do all operations as needed
        // When you see operator, pop operators that are >= in priority.
        // Do this till you encounter operator with less priority or stack is empty or you encounter (
        // At the end push the encountered operator
        // >= is done because an operator wants that bigger priority and equal priority left side operators
        // get processed before me
        // Also it is stopped if ( is encountered because influence of operators is only within brackets
        // When doing operation be mindful of difference bw a-b and b-a
        // Finally at end whatever is left in operator stack empty it and do operations accordingly
        // See solution video for simulation to gain better understanding
        // DTU Microsoft asked Infix to Prefix conversion
        // A block of code is repeated three times. I'm making it more modular in next class.

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
                    char operator = operators.pop();
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();

                    int result = getOperationResult(operand1, operand2, operator);
                    operands.push(result);
                }

                operators.pop(); // To pop '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.empty()
                        && operators.peek() != '('
                        && getPrecedence(ch) <= getPrecedence(operators.peek())) {
                    char operator = operators.pop();
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();

                    int result = getOperationResult(operand1, operand2, operator);
                    operands.push(result);
                }

                operators.push(ch);
            }
        }

        while (!operators.empty()) {
            char operator = operators.pop();
            int operand2 = operands.pop();
            int operand1 = operands.pop();

            int result = getOperationResult(operand1, operand2, operator);
            operands.push(result);
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
}
