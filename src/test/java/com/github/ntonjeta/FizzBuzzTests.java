package com.github.ntonjeta;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTests {

    @Test
    public void multipleOfThreeShouldBeFizz() {
        var fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.get(3)).isEqualTo("Fizz");
    }

    @Test
    public void multipleOfFiveShouldBeBuzz() {
        var fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.get(5)).isEqualTo("Buzz");
    }

    @Test
    public void multipleOfBothShouldBeFizzBuzz() {
        var fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.get(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void SumOfTwoNumberNotMultipleOfThreeOrFiveShouldBeNumeric() {
        var fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.add(3, 5)).isEqualTo(new Number(String.valueOf(8)));
    }

    @Test
    public void SumOfTwoNumberMultipleOfThreeShouldBeFizz() {
        var fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.add(3, 6)).isEqualTo(new Number("Fizz"));
    }

    @Test
    public void SumOfTwoNumberMultipleOfFiveShouldBeFizz() {
        var fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.add(3, 2)).isEqualTo(new Number("Buzz"));
    }

    @Test
    public void SumOfTwoNumberMultipleOfBothShouldBeFizzBuzz() {
        var fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.add(10, 5)).isEqualTo(new Number("FizzBuzz"));
    }
}