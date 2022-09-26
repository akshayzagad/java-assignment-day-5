package com.bridgelabz;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int i =1 ;
        for (i = 1; i<=10; i++){
            System.out.println( x +" * "+ i +" = "+ x * i );
        }
    }

    }



