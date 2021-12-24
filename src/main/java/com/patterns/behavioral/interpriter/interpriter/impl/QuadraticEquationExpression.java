package com.patterns.behavioral.interpriter.interpriter.impl;

import com.patterns.behavioral.interpriter.entity.QuadraticEquationContext;
import com.patterns.behavioral.interpriter.interpriter.MathExpression;

import static com.patterns.behavioral.interpriter.entity.QuadraticEquationContext.VariableName.*;

public class QuadraticEquationExpression implements MathExpression {

    @Override
    public float interpret(QuadraticEquationContext context) {
        MathExpression problemExpression = new SubtractionExpression(
                new MultiplyExpression(
                        new VariableExpression(B),
                        new VariableExpression(B)),
                new MultiplyExpression(
                        new MultiplyExpression(
                                new NumberExpression(4),
                                new VariableExpression(A)),
                        new VariableExpression(C)));
        return problemExpression.interpret(context);
    }

    public float interpretAlt(QuadraticEquationContext context) {
        VariableExpression a = new VariableExpression(A);
        VariableExpression b = new VariableExpression(B);
        VariableExpression c = new VariableExpression(C);

        MathExpression leftPart = new MultiplyExpression(b, b);

        MathExpression fourA = new MultiplyExpression(new NumberExpression(4), a);
        MathExpression rightPart = new MultiplyExpression(fourA, c);

        MathExpression problemExpression = new SubtractionExpression(leftPart, rightPart);
        return problemExpression.interpret(context);
    }
}
