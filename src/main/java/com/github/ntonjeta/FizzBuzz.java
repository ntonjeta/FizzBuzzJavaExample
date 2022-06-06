package com.github.ntonjeta;


import java.util.function.Function;
import java.util.function.Predicate;

public class FizzBuzz {
    public String get(int i) {
        var fizz = new Rule(integer -> i % 3 == 0, new Number("Fizz"));
        var buzz = new Rule(integer -> i % 5 == 0, new Number("Buzz"));
        var fizzbuzz = new Rule(integer -> i % 3 == 0 && i % 5 == 0, new Number("FizzBuzz"));

        return fizzbuzz.apply(buzz.apply(fizz.apply(new Number(String.valueOf(i))))).toString();
    }
}

class Number {
    private final String value;

    Number(String value) {
        this.value = value;
    }

    public Integer get() {
        return Integer.valueOf(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

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