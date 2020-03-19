package com.chiranjeevi.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Please Enter a String: ");
        str = sc.nextLine();
        if(isPalindrome(str))
            System.out.println("Yes, this is Palindrome");
        else
            System.out.println("No, this is not a palindrome");
    }

    private static boolean isPalindrome(String str) {
        if(str.length() <= 2)
        {
            System.out.println("Sorry, the String you entered is NULL or not used to check for Palindrome");
            return false;
        }
        else
        {
            str = str.replaceAll("\\W+", "").toLowerCase();
            for(int i = str.length()-1, j = 0; i > j ; i--, j++)
                if(str.charAt(i) != str.charAt(j))
                    return false;
            return true;
        }

    }
}