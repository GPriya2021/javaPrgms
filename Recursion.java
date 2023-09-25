package javaPrgms;

public class Recursion {

	public static void main(String[] args) {
		
		int n=1234;
		int temp = 0,rem;
		while(n>0) {
			rem=n%10;
			temp=temp*10+rem;
			n=n/10;
		}
		System.out.println(temp);

	}

}
