package com.github.ntonjeta;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

class RuleEngine {
    private final List<Rule> rules;

    public RuleEngine(List<Rule> rules) {
        this.rules = rules;
    }

    public String apply(Number number) {
        var result =  rules.stream()
                .map(rule -> rule.apply(number.get()))
                .flatMap(Optional::stream)
                .map(Number::toString)
                .collect(Collectors.toList());
        return result.isEmpty() ? number.toString() : String.join("", result);
    }
}
