package com.patterns.behavioral.interpriter.interpriter.impl;

import com.patterns.behavioral.interpriter.entity.QuadraticEquationContext;
import com.patterns.behavioral.interpriter.entity.QuadraticEquationContext.VariableName;
import com.patterns.behavioral.interpriter.interpriter.MathExpression;

public class VariableExpression implements MathExpression {

    private final VariableName variableName;

    public VariableExpression(VariableName variableName) {
        this.variableName = variableName;
    }

    @Override
    public float interpret(QuadraticEquationContext context) {
        return context.getVariables().get(variableName);
    }
}
