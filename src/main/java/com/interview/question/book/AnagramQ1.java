//check two strings are anagram..
//they are mix-up of characters in string. they  contain some characters but on different order.
package com.interview.question.book;

import java.util.Arrays;

public class AnagramQ1 {

	public static void main(String[] args) {
		System.out.println(anagramLogic("This is boy 234.", "324 Is				htsi.    yob"));
	}

	static boolean anagramLogic(String fw, String sw) {

		fw = fw.toLowerCase();
		sw = sw.toLowerCase();
		char[] w1 = fw.replaceAll("[\\s]", "").toCharArray();
		char[] w2 = sw.replaceAll("[\\s]", "").toCharArray();
		
		//w1 = fw.replaceAll("[^a-zA-Z0-9]", "").toCharArray(); //regular expression
		//w2 = sw.replaceAll("[^a-zA-Z0-9]", "").toCharArray(); //regular expression
		

		Arrays.sort(w1);
		Arrays.sort(w2);
		return Arrays.equals(w1, w2);
	}

}
