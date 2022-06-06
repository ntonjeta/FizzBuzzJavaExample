package com.github.ntonjeta;

public class FizzBuzz {

    public String get(int i) {
        var fizz = new Rule(integer -> i % 3 == 0, new Number("Fizz"));
        var buzz = new Rule(integer -> i % 5 == 0, new Number("Buzz"));
        var fizzbuzz = new Rule(integer -> i % 3 == 0 && i % 5 == 0, new Number("FizzBuzz"));

        var number = new Number(String.valueOf(i));
        return fizzbuzz.apply(buzz.apply(fizz.apply(number))).toString();
    }

    public Number add(int a, int b) {
        var op = new Operation((left, right) -> left + right);

        return new Number(get(op.apply(a, b)));
    }
}
