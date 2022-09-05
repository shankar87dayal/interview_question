//counting using collection
package com.interview.question.book;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountingString2 {

	public static void main(String[] args) {

	 String str="googleggnm";
	 char cArrray[] = str.toCharArray();
	 Map<Character, Integer> cm= new LinkedHashMap<Character, Integer>();
	 for(Character c : cArrray) {
		 if(cm.containsKey(c))
			 cm.put(c, (cm.get(c)+1));
		 else
			 cm.put(c, 1);
	 }
	 Set<Character> dup = new LinkedHashSet<>();
	 
	 System.out.println(cm);
	 Set<Map.Entry<Character, Integer>> st =cm.entrySet();
	 
	 for (Map.Entry<Character, Integer> ent:st) {
		 System.out.println(ent.getKey()+ "=>"+ent.getValue());
		 if(ent.getValue()>1)
			 dup.add(ent.getKey());
		 
	 }
	 
	 System.out.println(dup);
	}
}
