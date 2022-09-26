package com.bridgelabz;

import java.util.Scanner;

public class even_odd {

        static void method2(int x){
            System.out.println(x);
            if(x%2 == 0){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        public static void main(String[] args) {
            System.out.print("Enter x: ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            method2(x);

        }
    }


