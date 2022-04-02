package com.codegym;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str,characters;
        int count = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string : ");
        str = scanner.nextLine().toLowerCase();

        System.out.println("Enter a character you want to find : ");
        characters = scanner.nextLine().toLowerCase();

        if (characters.length() > 1) {
            System.out.println("Enter only one character: ");

        }else {
            for(int i = 0; i < str.length(); i++) {
                if(characters.charAt(0) == str.charAt(i)) {
                    flag = true;
                    count++;
                }
            }

            if(!flag) {
                System.out.println("This character is not exist ");
            }else {
                System.out.println("The number of this character = " + count);
            }
        }
    }
}

