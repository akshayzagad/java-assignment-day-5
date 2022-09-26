package com.bridgelabz;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class POWE {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        System.out.print("Enter p: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
m1(n,p);
    }

    static void m1(int n,int p) {
        int reasult= 1;
        for (int i=1;i<=p;i++){
            reasult= reasult * p;
        }
        System.out.println(n + "^"+p + "="+ reasult);
    }
}
