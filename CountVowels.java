package javaPrgms;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Apple is a fruit";
		countVowels(s);
	}
	public static boolean chkVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			return true;
		else
			return false;
	}
	public static void countVowels(String s) {
		char[] ch=s.toCharArray();
		int vowelCount = 0;
		for(char c:ch) {
			if(chkVowel(c)){
				vowelCount+=1;
			}
		}
		System.out.println("Vowel Count:"+vowelCount);
	}

}
