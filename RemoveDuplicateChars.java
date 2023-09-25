package javaPrgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String s="abcdaefghbcsec";
		printDuplicateChars(s);
	}

	public static void printDuplicateChars(String s) {
		Map<Character,Integer> hm=new HashMap<>();
		for(char c:s.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		for(Entry<Character, Integer> e:hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.println("Repeated Chars:"+e.getKey());
			}
		}
	}
}
