package programming.task;

import java.util.Scanner;

public class Max_val_sum_mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		System.out.println("Please enter the number of inputs");
		int input=in.nextInt();
		int[] a=new int[input];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		System.out.println();
		
		
		System.out.println( " before : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		
		
		for (int i = 0; i < a.length; i++) {
			int add=0,mul=1;
			int b=a[i];
			while(b>0){
				int x=b%10;
				
				add+=x;
				mul*=x;
				
				b=b/10;
			}
			if(add>mul) {
				a[i]=add;
			
			}else{
				a[i]=mul;
			}
		}
		
		System.out.println("after : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
	}

}
