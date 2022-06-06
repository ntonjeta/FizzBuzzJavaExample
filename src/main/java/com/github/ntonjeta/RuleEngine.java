package com.github.ntonjeta;

import java.util.List;

class RuleEngine {

    private final List<Rule> rules;

    public RuleEngine(List<Rule> rules) {
        this.rules = rules;
    }

    public String apply(Number number) {
        Number result = number;
        for (var rule : rules) {
            result = rule.apply(number);
            if (!result.equals(number)) return result.toString();
        }
        return result.toString();
    }
}
