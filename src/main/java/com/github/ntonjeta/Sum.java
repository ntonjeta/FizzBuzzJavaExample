package com.github.ntonjeta;

import java.util.function.BiFunction;

class Sum implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer a, Integer b) {
        return a + b;
    }
}
