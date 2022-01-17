package com.kaboomb.interpreter;

public class Main {
    public static void main(String[] args) {
        ValueExpression expression = new ValueExpression(1);
        ValueExpression expression1 = new ValueExpression(10);

        PlusExpression plusExpression = new PlusExpression(expression, expression1);
        System.out.println("1 + 10 = " + plusExpression.interpret());

        PlusExpression anotherPlus = new PlusExpression(plusExpression, plusExpression);
        System.out.println("11 + 11 = " + anotherPlus.interpret());

        MultiplyExpression multiplyExpression = new MultiplyExpression(anotherPlus, plusExpression);
        System.out.println("11 * 22 = " + multiplyExpression.interpret());
    }
}
