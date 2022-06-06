package com.github.ntonjeta;

import java.util.Arrays;

public class FizzBuzz {
    private final RuleEngine ruleEngine;

    public FizzBuzz() {
        var fizz = new Rule(integer -> integer % 3 == 0, new Number("Fizz"));
        var buzz = new Rule(integer -> integer % 5 == 0, new Number("Buzz"));
        var zac = new Rule(integer -> integer % 7 == 0, new Number("Zac"));
        ruleEngine = new RuleEngine(Arrays.asList(fizz, buzz, zac));
    }

    public String get(int i) {
        return ruleEngine.apply(new Number(String.valueOf(i)));
    }

    public Number add(int a, int b) {
        var op = new Operation(Integer::sum);

        return new Number(get(op.apply(a, b)));
    }
}
