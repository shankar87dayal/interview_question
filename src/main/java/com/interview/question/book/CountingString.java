//counting occurrence of two character in string 

package com.interview.question.book;

public class CountingString {
	public static void main(String[] args) {
      String str ="mmsssbbbbmm";
      char ch[] =str.toCharArray();
      for (int i = 0; i < ch.length; i++) {
		int counter=0;
		char c= ch[i];
		for (int j = 0; j < ch.length; j++) {
			if(c == ch[j]) {
				counter++;
				ch[j] = '\u0000';
				
			}
		}
		if (counter >0) {
			if (c!= '\u0000') {
				System.out.println(c+ "=> " +counter);
			}
		}
		
	}
	}
}
