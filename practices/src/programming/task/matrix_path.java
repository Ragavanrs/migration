package programming.task;

import java.util.Scanner;

public class matrix_path {

	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		
		System.out.println("enter the n matrix ");
		int a=in.nextInt();
		int[][] b=new int[a][a];
		boolean value=false;
		int j;
		for(int i=0;i<a;i++) {
			for(j=0;j<a;j++) {
				b[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<a-1;i++) {
			for(j=0;j<a;j++) {
				if(b[i][j]==1) {
					if(b[i+1][j]==1) {
						value=true;
						break;
					}
									}
				value=false;
				
			}
			
			if(j+1==a && value ==false) {
				
				break;
			}
		}
		if(value==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
		in.close();
		
	}

}
