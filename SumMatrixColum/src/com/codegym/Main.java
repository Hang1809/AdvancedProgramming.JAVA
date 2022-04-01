package com.codegym;

public class Main {

    public static void main(String[] args) {
                int[][] matrix = {
                        {1, 2, 3, 0},
                        {4, 5, 6, 9},
                        {7, 2, 5, 5}
                };
                for(int column = 0; column < matrix[0].length; column++){
                    int total = 0;
                    for(int row = 0; row < matrix.length; row++){
                        total += matrix[row][column];
                    }
                    System.out.println("Sum for column " + column + " is " + total);
                }
    }
}
