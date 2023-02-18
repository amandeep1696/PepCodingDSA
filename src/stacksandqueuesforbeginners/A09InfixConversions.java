package stacksandqueuesforbeginners;

import java.util.Scanner;
import java.util.Stack;

public class A09InfixConversions {
    public static void main(String[] args) {
        // 1. You are given an infix expression.
        //2. You are required to convert it to postfix and print it.
        //3. You are required to convert it to prefix and print it.

        // 1. Expression is balanced
        //2. The only operators used are +, -, *, /
        //3. Opening and closing brackets - () - are used to impact precedence of operations
        //4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
        //5. In two operators of equal precedence give preference to the one on left.
        //6. All operands are single digit numbers.

        // See question video 119 to understand and see simulation
        // The rules are exactly similar to infix evaluation so I'm not writing here.

        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();

        Stack<String> prefixOperands = new Stack<>();
        Stack<String> postfixOperands = new Stack<>();
        Stack<String> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if(Character.isLetterOrDigit(ch)) { // Can also do ch >= '0' && ch <= '9' || lly for 'a' 'z' 'A' 'Z'
                prefixOperands.push(String.valueOf(ch)); // can also do  ch + ""  to convert to string
                postfixOperands.push(String.valueOf(ch));
            } else if (ch == '(') {
                operators.push(String.valueOf(ch));
            } else if (ch == ')') {
                while (!operators.empty() && !operators.peek().equals("(")) {
                    doPrefixOperation(prefixOperands, operators);
                    doPostfixOperation(postfixOperands, operators);
                }

                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (!operators.empty()
                        && !operators.peek().equals("(")
                        && getPrecedence(String.valueOf(ch)) <= getPrecedence(operators.peek())) {
                    doPrefixOperation(prefixOperands, operators);
                    doPostfixOperation(postfixOperands, operators);
                }

                operators.push(String.valueOf(ch));
            }
        }

        while (!operators.empty()) {
            doPrefixOperation(prefixOperands, operators);
            doPostfixOperation(postfixOperands, operators);
        }

        System.out.println(postfixOperands.peek());
        System.out.println(prefixOperands.peek());
    }

    private static int getPrecedence(String operator) {
        if (operator.equals("+") || operator.equals("-")) {
            return 1;
        } else {
            return 2;
        }
    }

    private static void doPrefixOperation(Stack<String> prefixOperands, Stack<String> operators) {
        String operator = operators.pop();
        String secondPrefixOperand = prefixOperands.pop();
        String firstPrefixOperand = prefixOperands.pop();

        String prefixOperationResult = operator.concat(firstPrefixOperand).concat(secondPrefixOperand);
        prefixOperands.push(prefixOperationResult);
        operators.push(operator); // Doing this just here because operator will be used by postfix operation too
        // Won't do above line ideally but since we're using single stack for both operations we have to do.
    }

    private static void doPostfixOperation(Stack<String> postfixOperands, Stack<String> operators) {
        String operator = operators.pop();
        String secondPostfixOperand = postfixOperands.pop();
        String firstPostfixOperand = postfixOperands.pop();

        String postfixOperationResult = firstPostfixOperand.concat(secondPostfixOperand).concat(operator);
        postfixOperands.push(postfixOperationResult);
    }
}
