package com.patterns.behavioral.interpriter.interpriter.impl;

import com.patterns.behavioral.interpriter.entity.QuadraticEquationContext;
import com.patterns.behavioral.interpriter.interpriter.MathExpression;

public class NumberExpression implements MathExpression {

    private final float value;

    public NumberExpression(float value) {
        this.value = value;
    }

    @Override
    public float interpret(QuadraticEquationContext context) {
        return value;
    }
}
