package com.github.ntonjeta;

import java.util.Arrays;

public class FizzBuzz {

    public FizzBuzz() {
    }

    public String get(int i) {
        var fizz = new Rule(integer -> i % 3 == 0, new Number("Fizz"));
        var buzz = new Rule(integer -> i % 5 == 0, new Number("Buzz"));
        var fizzbuzz = new Rule(integer -> i % 3 == 0 && i % 5 == 0, new Number("FizzBuzz"));
        var ruleEngine = new RuleEngine(Arrays.asList(fizzbuzz, buzz, fizz));

        var number = new Number(String.valueOf(i));

        return ruleEngine.apply(number);
    }

    public Number add(int a, int b) {
        var op = new Operation(Integer::sum);

        return new Number(get(op.apply(a, b)));
    }
}
