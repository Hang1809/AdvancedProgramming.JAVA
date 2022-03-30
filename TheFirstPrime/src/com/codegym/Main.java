package com.codegym;

public class Main {

    public static void main(String[] args) {
	    int number =20, n=2, count=1 ;

        while (count<= number){
            boolean flag =true;
            for( int i=2 ; i < n ; i++){
                if (n % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf(" %d\t", n);
                count ++;
            }
            n++;
        }
    }
}
