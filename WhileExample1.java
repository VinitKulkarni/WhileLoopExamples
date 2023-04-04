package com.bridgelabz.WhileExamples;


//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class WhileExample1 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        while(n != 0){
            sum = sum + n;
            n--;
        }
        System.out.println(sum);
    }

}
