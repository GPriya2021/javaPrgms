package javaPrgms;

public class OddTriangle {

	public static void main(String[] args) {
		int n=7;int curNum;
		for(int i=1;i<n;i++) {
			curNum=1;
			for(int j=1;j<=i+1;j++) {
				System.out.print(curNum+" ");
				curNum+=2;
			}
			System.out.println("\n");
		}
	}

}
