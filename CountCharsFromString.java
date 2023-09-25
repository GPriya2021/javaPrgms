package javaPrgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharsFromString {
	public static void main(String[] a) {
		CountCharsFromString ccs=new CountCharsFromString();
		String s="ababababdcfsda";
		System.out.println("String:"+s+",count of char 'a':"+ccs.countSpecifiedChar(s,'a'));
		//System.out.println("String:"+s+",count of char 'f':"+ccs.countSpecifiedChar(s,'f'));
		//System.out.println("String:"+s+",count of char 'b':"+ccs.countSpecifiedChar(s,'b'));
		//System.out.println("String:"+s+",count of char 'c':"+ccs.countSpecifiedChar(s,'c'));
		ccs.countAllCharOccurance(s);
		ccs.charCountUsingStream(s);
	}
	public void charCountUsingStream(String sh) {
		Map<String,Long> m=Arrays.stream(sh.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s->s,LinkedHashMap::new, Collectors.counting()));
		System.out.println("charCountUsingStream:"+m);
	}
	public void countAllCharOccurance(String s) {
		HashMap<Character,Integer> hm=new HashMap<>();

		for(Character c:s.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm.entrySet().toString());
	}
	
	public String countSpecifiedChar(String s,char a) {
		HashMap<Character,Integer> hm=new HashMap<>();

		for(Character c:s.toCharArray()) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		return hm.get(a).toString();
	}
}
