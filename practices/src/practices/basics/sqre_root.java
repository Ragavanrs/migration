package practices.basics;

import java.util.Scanner;

//sqrtn+1=(sqrtn+(num/sqrtn))/2.0
public class sqre_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int val=in.nextInt();
		System.out.println(val);
		double sq=val/2;
		double t;
		
		do {
			t=sq;
		sq=(sq+(val/sq))/2;
		}while((t-sq)!= 0);  
		System.out.println(sq);
		in.close();
	}

}