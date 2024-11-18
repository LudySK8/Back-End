package br.com.tludmyla.lambdas;

import java.util.function.IntBinaryOperator;

/**
 * @author ludmyla.toledo
 */
public class IntBinaryOperatorClass implements IntBinaryOperator {

    @Override
    public int applyAsInt(int a, int b) {
        return a + b;
    }
}
