package practices.basics;

import java.util.Scanner;

public class prime {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int var=in.nextInt();
		int i;
		for(i=2;i<Math.sqrt(var);i++) {
			if(var%i==0) {
				System.out.println("it is not prime");
				break;
			}
		}

		if(i>=Math.sqrt(var)) {
			System.out.println("it is prime number");
		}
		in.close();
	}

}
