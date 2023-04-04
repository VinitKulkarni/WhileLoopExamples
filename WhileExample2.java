package com.bridgelabz.WhileExamples;

//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class WhileExample2 {
    static int reverseNumber(int number){
        int reminder = 0;
        int result = 0;

        while (number != 0){
            reminder = number % 10;
            result = result * 10 + reminder;
            number = number / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 1234;
        int tempVariable = number;

        int finalResult = reverseNumber(number);
        System.out.println(finalResult);
    }
}
