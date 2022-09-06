package com.interview.question.book;

import java.util.Arrays;

public class Sorting_String_Array {
	public static void main(String[] args) {
		String nm[] = { "s", "d", "a" , "z", "r"};
		for (int i = 0; i < nm.length; i++) {
			for (int j = i + 1; j < nm.length; j++) {

				String t1 = nm[i];
				String t2 = nm[j];
				int rs = t1.compareTo(t2);
				if (rs > 0) {
					nm[i] = t2;
					nm[j] = t1;

			}

		}
		
	}
		
		String str = Arrays.toString(nm);
		System.out.println(str);
}
}
