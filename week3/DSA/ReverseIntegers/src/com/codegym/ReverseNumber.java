package com.codegym;

import java.util.Stack;

public class ReverseNumber {
    static Stack <Integer> st = new Stack<>();
    static void pushNumber(int number){
        while (number !=0){
            st.push(number % 10);
            number = number/10;
        }
    }
    static  int reverseNumber(int number){
    pushNumber(number);
    int reverse =0 ;
    int i = 1;
    while ( (!st.isEmpty())){
    reverse = reverse + (st.peek()* i);
    st.pop();
    i= i *10;
    }
    return reverse;
    }


    public static void main(String[] args) {
        int number = 12345;
        System.out.println(reverseNumber(number));
    }
}

