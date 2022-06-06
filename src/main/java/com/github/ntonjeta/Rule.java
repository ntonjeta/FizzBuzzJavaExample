package com.github.ntonjeta;

import java.util.function.Function;
import java.util.function.Predicate;

class Rule implements Function<Number, Number> {
    private final Predicate<Number> check;
    private final Number value;

    Rule(Predicate<Number> check, Number value) {
        this.check = check;
        this.value = value;
    }

    @Override
    public Number apply(Number number) {
        if (check.test(number)) return value;
        return number;
    }
}