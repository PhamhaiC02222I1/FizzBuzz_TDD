package com.company;

import java.util.Scanner;

public class FizzBuzz {
    public static Object testFizzBuzz(int number){
//        Scanner scanner=new Scanner(System.in);
//        do {
//            number=scanner.nextInt();
//        }while (number>0&&number<100);
        if (number%3==0&&number%5==0) return "FizzBuzz";
         if (number%3==0) return "Fizz";
        if (number%5==0) return "Buzz";

        return number;
    }

}
