package practices.basics;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr= {1,2,3,4,5};
		System.out.println(Arrays.asList(arr));
		String[] arr1= {"abc","cde","fgh","las"};
		System.out.println(Arrays.asList(arr1));
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
		Collections.reverse(Arrays.asList(arr1));
		System.out.println(Arrays.asList(arr1));
	}

}
