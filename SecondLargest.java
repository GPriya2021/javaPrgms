package javaPrgms;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int firstHighest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>firstHighest) {
				secondHighest=firstHighest;
				firstHighest=i;
			}
		}
		System.out.println("secondHighest:"+secondHighest);
		int secndHighest=Arrays.stream(arr).boxed()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println("secndHighest:"+secndHighest);
		
	}

}
