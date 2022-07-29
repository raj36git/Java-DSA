package com.rk.Java_Basics.Function;
//Q1: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        max();
       min();
    }
    static void max() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        System.out.println("Maximum number is " + max);
    }
    static void min() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        int min = num1;
        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
            min = num3;
        }
        System.out.println("Minimum number is " + min);
    }
}
