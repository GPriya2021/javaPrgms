package javaPrgms;

public class PermutationStrs {

	public static void main(String[] args) {
		String s1="GOD";
		permutation(s1);
	}
	public static void permutation(String input){ 
		permutation("", input);
		
	}

public static void permutation(String input,String s) {
	for(int i=0;i<s.length();i++) {
		permutation(input+s.charAt(i),s.substring(0,i)+s.substring(i+1,s.length()));
		System.out.print(s.charAt(i)+s.substring(0,i)+s.substring(i+1,s.length())+",");
		//System.out.println(input+s.charAt(i)+s.substring(0,i)+s.substring(i+1,s.length())+",");
	}
}
}
