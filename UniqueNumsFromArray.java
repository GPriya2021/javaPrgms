package javaPrgms;

import java.util.Arrays;

public class UniqueNumsFromArray {

	public static void main(String[] args) {
		 Integer[] a = {4, 7, 8, 5, 4, 5};
	       for(Integer i:a) {
	    	   if(Arrays.asList(a).indexOf(i)==Arrays.asList(a).lastIndexOf(i)) {
	    		   System.out.println("Unique NUMBERS:"+i);
	    	   }
	       }
		}

}
