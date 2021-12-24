package com.patterns.behavioral.interpriter.entity;

import java.util.HashMap;
import java.util.Map;

public class QuadraticEquationContext {

    public enum VariableName { A, B, C}

    private final Map<VariableName, Float> variables;

    public QuadraticEquationContext(float a, float b, float c) {
        variables = new HashMap<VariableName, Float>() {{
            put(VariableName.A, a);
            put(VariableName.B, b);
            put(VariableName.C, c);
        }};
    }

    public Map<VariableName, Float> getVariables() {
        return new HashMap<>(variables);
    }
}
