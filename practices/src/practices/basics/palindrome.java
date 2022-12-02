package practices.basics;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner in = new Scanner(System.in);
		String a=in.next();
		StringBuilder val=new StringBuilder(a);
		val.reverse();
		if(a.contentEquals(val)) {
			System.out.println("it is palidrome");
		}
		else {
			System.out.println("it is not a palidrome");
		}
		in.close();
	}

}
