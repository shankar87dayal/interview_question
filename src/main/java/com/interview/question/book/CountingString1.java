package com.interview.question.book;

public class CountingString1 {
	public static void main(String[] args) {
		String s = "mmsssbbbbmm";
		char c[] = s.toCharArray();
		char b = s.charAt(0);
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (b == c[i]) {
				count++;
			} else {
				System.out.println(b + "" + count);
				b = c[i];
				count = 1;
			}

		}
		System.out.println(b + "" + count);
	}

}
