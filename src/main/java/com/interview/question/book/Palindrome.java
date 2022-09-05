package com.interview.question.book;

public class Palindrome {

	public static void main(String[] args) {
		String st1 = "ohho";
		StringBuilder st2 =new StringBuilder();
		for (int i = (st1.length()-1); i>=0; i--) {
			st2.append(st1.charAt(i));
		}
		if (st1.equals(st2.toString())) 
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
