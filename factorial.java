package com.bridgelabz;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        m2(n);
    }
    static void m2(int n){
        int factorial=1 ;
        int i = 1;
        for ( i = 1; i<=n ; i++)
        {
            factorial = factorial * i;
        }
        System.out.println( "factorial" + factorial  );
    }

}
