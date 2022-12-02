package programming.task;

import java.util.Scanner;

public class direction_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the direction in URLD");
		
		String st=in.nextLine();
		System.out.println("Enter the initial position x & y");
		int x=in.nextInt();
		int y=in.nextInt();
		System.out.println("before= x : "+x+" y : "+y);
		char[] a=st.toCharArray();
		for(int i=0;i<st.length();i++) {
			switch(a[i]) {
			
			case 'U': y++;
			break;
			case 'D': y--;
			break;
			case 'R': x++;
			break;
			case 'L': x--;
			break;
				
			}
		}
		System.out.println(" x : "+x+" y : "+y);
		in.close();
		
	}

}
