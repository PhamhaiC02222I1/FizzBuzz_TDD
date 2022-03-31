package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class fizzBuzzTest {

    @Test
    void testFizzBuzz1() {
        Scanner scanner=new Scanner(System.in);
        int number=6;
//        FizzBuzz fizzBuzz=new FizzBuzz();
        Object result=FizzBuzz.testFizzBuzz(number);
        Assertions.assertEquals("Fizz",result);
    }
    @Test
    void testFizzBuzz2() {
        Scanner scanner=new Scanner(System.in);
        int number=10;
//        FizzBuzz fizzBuzz=new FizzBuzz();
        Object result=FizzBuzz.testFizzBuzz(number);
        Assertions.assertEquals("Buzz",result);
    }
    @Test
    void testFizzBuzz3() {
        Scanner scanner=new Scanner(System.in);
        int number=30;
//        FizzBuzz fizzBuzz=new FizzBuzz();
        Object result=FizzBuzz.testFizzBuzz(number);
        Assertions.assertEquals("FizzBuzz",result);
    }

}