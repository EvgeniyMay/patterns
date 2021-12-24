package com.patterns.behavioral.interpriter.interpriter.impl;

import com.patterns.behavioral.interpriter.entity.QuadraticEquationContext;
import com.patterns.behavioral.interpriter.interpriter.MathExpression;

public class MultiplyExpression implements MathExpression {

    private final MathExpression leftExpression;
    private final MathExpression rightExpression;

    public MultiplyExpression(MathExpression leftExpression, MathExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public float interpret(QuadraticEquationContext context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
