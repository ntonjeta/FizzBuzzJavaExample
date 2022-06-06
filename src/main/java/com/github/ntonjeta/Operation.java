package com.github.ntonjeta;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

class Operation implements BiFunction<Integer, Integer, Integer> {
    private final IntBinaryOperator op;

    public Operation(IntBinaryOperator op) {
        this.op = op;
    }

    @Override
    public Integer apply(Integer a, Integer b) {
        return op.applyAsInt(a, b);
    }
}
