package practices.basics;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int val=in.nextInt();
		int a=0,b=0,c=1;
		while(a<val) {
			System.out.print(a + " ");
			a=b;
			b=c;
			c=a+b;
		}
		
		in.close();
	}

}
