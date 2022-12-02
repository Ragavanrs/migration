package practices.basics;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=fact(x);
		System.out.println(y);
	in.close();	
	}
	public static int fact(int x) {
	
		if (x>=1) {
		return x*fact(x-1);
		}
		else {
			return 1;
		}
	}
}
