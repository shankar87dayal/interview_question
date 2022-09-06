package com.interview.question.book;

import java.util.Arrays;

public class Sorting_Char_Array {

	public static void main(String[] args) {
		Character nm[] = { 'A', 'Z', 'K', 'R', 'B'};
		for (int i = 0; i < nm.length; i++) {
			for (int j = i + 1; j < nm.length; j++) {

				Character t1 = nm[i];
				Character t2 = nm[j];
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
