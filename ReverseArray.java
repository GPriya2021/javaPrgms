package javaPrgms;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 7, 6, 4, 9, 12 };

		for (int t = 0; t < a.length / 2; t++) { 

		    int tmp = a[t]; 

		    a[t] = a[a.length - t - 1]; 

		    a[a.length - t- 1] = tmp; 

		} 
		for(int i:a) {
			System.out.println(i);
		}
	}

}
