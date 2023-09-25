package javaPrgms;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		String s1="Mary", s2="Army";
		validateAnagram(s1.toLowerCase(),s2.toLowerCase());
		String s3="dad", s4="Add";
		validateAnagram(s3.toLowerCase(),s4.toLowerCase());
		String s5="Priya", s6="Geetha";
		validateAnagram(s5.toLowerCase(),s6.toLowerCase());
	}
	public static String returnSortStr(String s) {
		return Stream.of(s.split("")).sorted().collect(Collectors.joining());
	}

	public static void validateAnagram(String s1,String s2) {
		if(returnSortStr(s1).equals(returnSortStr(s2))) {
			System.out.println("String s1 & S2 are Anagrams:"+s1+":"+s2);
		}else {
			System.out.println("String s1 & S2 are not Anagrams:"+s1+":"+s2);
		}
	}
}
