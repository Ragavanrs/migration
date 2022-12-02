package practices.basics;

import java.util.Scanner;

public class swap_wt_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println(a +" " +b);
		if(a!=b) {
			a=a+b;
			b=a-b;
			a=a-b;
		}
		System.out.println(a +" " +b);
		in.close();
	}

}
