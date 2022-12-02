package practices.basics;

import java.util.Scanner;

public class Integer_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int var=0,y=x;
		while(y!=0) {
			var =var*10+y%10;
			y=y/10;
		}
		if(x==var) {
			System.out.println("it is integer palindrome");
		}else {
			System.out.println("it is not integer palindrome");
		}
		in.close();
	}

}
