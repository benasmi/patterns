package com.kaboomb.interpreter;

public class ValueExpression extends Expression {

    private final int value;

    public ValueExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
