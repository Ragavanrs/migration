package practices.basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int x=in.nextInt();
		
		int y=x,var=0;
		
		while(y!=0) {
			var=var+(int) Math.pow(y%10, 3);
			y=y/10;
		}
		if(x==var) {
			System.out.println("given number is armstrong number");
		}else {
			System.out.println("given number is not armstrong number");
		}
		in.close();
	}

}
