package com.rk.Basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  //   FIRST JAVA PROGRAM
        System.out.println("Hello Java World");

 //     WAY TO TAKE INPUT
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

 //   PRIMITIVE DATA TYPE
        int no = 2;
        char ch = 'a';
        short a = 112;
        byte v = 2;
        float marks = 28.33f;
        double largedecimal = 7632452173.78346;
        long largeint = 8734628;
        boolean check = true; //or false

 //   NON-PRIMITIVE DATA TYPE
        String name = "Hey my name is Raj Yadav";
        System.out.println(name);

    }
}
