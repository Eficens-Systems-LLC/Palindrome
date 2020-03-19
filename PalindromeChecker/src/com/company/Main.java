package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String reverse = "";
        for(int i = str.length()-1; i >= 0 ; i--)
        {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.contentEquals(str))
            System.out.println("Yes, this is a palindrome");
        else
            System.out.println("No, it is not a palindrome");
    }


}
