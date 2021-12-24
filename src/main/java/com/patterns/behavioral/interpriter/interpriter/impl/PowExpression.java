package com.patterns.behavioral.interpriter.interpriter.impl;

import com.patterns.behavioral.interpriter.entity.QuadraticEquationContext;
import com.patterns.behavioral.interpriter.interpriter.MathExpression;

public class PowExpression implements MathExpression {

    private final MathExpression numberExpression;
    private final MathExpression powExpression;

    public PowExpression(MathExpression numberExpression, MathExpression powExpression) {
        this.numberExpression = numberExpression;
        this.powExpression = powExpression;
    }

    @Override
    public float interpret(QuadraticEquationContext context) {
        return (float)Math.pow(numberExpression.interpret(context), powExpression.interpret(context));
    }
}
