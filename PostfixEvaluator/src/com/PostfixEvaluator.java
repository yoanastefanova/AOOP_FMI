package com;

import stackcomposition.StackComposition;

public class PostfixEvaluator {

    public static int evaluatePostfixExpression(StringBuffer expr) {

        StackComposition<Integer> intStack = new StackComposition<>();

        int popVal1, popVal2, pushVal;
        char c;


        expr.append(')'); // appending a right bracket at the end of the expr in order to indicate when it ends

        for (int i = 0; expr.charAt(i) != ')'; ++i) { // until we reach ')'

            if (Character.isDigit(expr.charAt(i))) {
                pushVal = expr.charAt(i) - '0'; // transform the char(number) into an int
                intStack.push(pushVal);//put the transformed char in the stack
                System.out.println(intStack);
            } else if (!Character.isWhitespace(expr.charAt(i))) { // if it's an operator
                popVal2 = intStack.pop();
                popVal1 = intStack.pop();
                pushVal = calculate(popVal1, popVal2, expr.charAt(i));
                intStack.push(pushVal);
                System.out.println(intStack);
            }

        }

        return intStack.pop();
    }

    private static int calculate(int val1, int val2, char op) {
        switch (op) {
            case '+':
                return val1 + val2;

            case '-':
                return val1 - val2;

            case '*':
                return val1 * val2;

            case '/':
                return val1 / val2;

            case '^':
                return (int) Math.pow(val1, val2);
        }

        return 0;
    }


}
