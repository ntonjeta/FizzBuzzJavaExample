package com.github.ntonjeta;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

public class AppTests {

   @Test
   public void multipleOfThreeShouldBeFizz() {
      var fizzBuzz = new FizzBuzz();

      assertThat(fizzBuzz.get(3)).isEqualTo("Fizz");
//      assertEquals("Fizz", fizzBuzz.get(3));
   }

   @Test
   public void multipleOfFiveShouldBeBuzz() {
      var fizzBuzz = new FizzBuzz();

      assertThat(fizzBuzz.get(5)).isEqualTo("Buzz");
//      assertEquals("Buzz", fizzBuzz.get(5));
   }

   @Test
   public void multipleOfBothShouldBeFizzBuzz() {
      var fizzBuzz = new FizzBuzz();

      assertThat(fizzBuzz.get(15)).isEqualTo("FizzBuzz");
//      assertEquals("FizzBuzz", fizzBuzz.get(15));
   }
}