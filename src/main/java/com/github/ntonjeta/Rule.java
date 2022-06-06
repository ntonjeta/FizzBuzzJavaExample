package com.github.ntonjeta;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

class Rule implements Function<Integer, Optional<Number>> {
    private final Predicate<Integer> check;
    private final Number value;

    Rule(Predicate<Integer> check, Number value) {
        this.check = check;
        this.value = value;
    }

    @Override
    public Optional<Number> apply(Integer number) {
        if (check.test(number)) return Optional.of(value);
        return Optional.empty();
    }
}