package com.rk.Java_Basics.Java_First_Program;

//  Question2:Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("Good Morning"+ " "+ name);

    }
}
