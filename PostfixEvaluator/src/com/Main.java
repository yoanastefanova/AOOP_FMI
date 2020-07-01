package com;

import static com.PostfixEvaluator.evaluatePostfixExpression;

public class Main {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("12+5*3/");

        System.out.println(evaluatePostfixExpression(sb));




    }
}
