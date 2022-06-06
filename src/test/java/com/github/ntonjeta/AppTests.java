package com.github.ntonjeta;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTests {

   @Test
   public void multipleOfThreeShouldBeFizz() {
      FizzBuzz fizzBuzz = new FizzBuzz();

      Assert.assertEquals("Fizz", fizzBuzz.get(3));
   }

}