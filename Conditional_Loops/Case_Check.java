package com.rk.Java_Basics.Condition;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch > 'A' && ch < 'Z'){
            System.out.println("UpperCase");
        } else {
            System.out.println("LowerCase");
        }

    }
}
