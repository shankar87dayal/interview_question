package com.interview.question.pattern;

public class Pattern7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == j || (i + j) == (5 + 1))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}
