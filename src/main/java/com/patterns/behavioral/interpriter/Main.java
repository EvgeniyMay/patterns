package com.patterns.behavioral.interpriter;

import com.patterns.behavioral.interpriter.entity.QuadraticEquationContext;
import com.patterns.behavioral.interpriter.interpriter.impl.QuadraticEquationExpression;

public class Main {

    public static void main(String[] args) {
        QuadraticEquationContext context = new QuadraticEquationContext(1, 10, 2);

        float d = new QuadraticEquationExpression().interpret(context);

        System.out.println("D = " + d);
    }
}
