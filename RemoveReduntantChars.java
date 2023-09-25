package javaPrgms;

import java.util.Stack;

public class RemoveReduntantChars {

	public static void main(String[] args) {
		
		String[] s= {"abcd**cde*e","****","**asd*ff*"};
		for(String sh:s) {
			System.out.println(sh+":"+removeredundantStr(sh));
		}
	}

	public static String removeredundantStr(String s) {
		char[] ch=s.toCharArray();
		Stack<Character> st=new Stack<Character>();
        StringBuilder str = new StringBuilder();

		for(char c:ch) {
			if(c == '*' && !st.isEmpty()) {
				st.pop();
			}else {
				st.push(c);
			}
		}
		if(st.isEmpty()) {
			System.out.println("String has no chars:"+s);
		}
		for(char c:st) {
			str.append(c);
		}
		return str.toString();
	}
}
