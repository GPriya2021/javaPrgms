package javaPrgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharsCount {
	
	public static Map<Character,Integer> hm=new HashMap<>();
	
	public static void main(String[] args) {
		String s="aabbBCccD";
		countChars(s.toLowerCase());
	}
	
	public static void countChars(String a) {
		for(Character c:a.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		String apdStr = "";
		for(Entry<Character,Integer> e:hm.entrySet()) {
			apdStr+=e.getKey()+String.valueOf(e.getValue());
		}
		System.out.println("Appended String:"+apdStr);
	}

}
