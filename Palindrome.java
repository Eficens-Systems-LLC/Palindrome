package com.geetanjali.project;

public class Palindrome
{
	public static void main(String[] args)
	{
		int a = 123454321;
		String reverse = "";
		String p = Integer.toString(a);
		
		for (int i = p.length()-1; i >= 0; i--)
		{
				reverse += p.charAt(i);
		}
			if (p.equals(reverse))
			{
				System.out.println("Its a Palindrome");
			}
			else
			{
				System.out.println("Its not a Palindrome");
				
			}
	}
}
