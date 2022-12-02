package programming.task;

import java.util.Scanner;

public class Reverse_String_contain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		String input1=in.nextLine();
		String input2=in.next();
		String temp;
		System.out.println("before :");
		System.out.println(input1);
		String[] a=input1.split(" ");
		int x=0,y=a.length-1;
		for (String c : a) {
			if(c.contains(input2))
				break;
			
		x++;
		}
		for(int i=x;i<y;i++,y--) {
			temp=a[i];
			a[i]=a[y];
			a[y]=temp;
		}
		StringBuilder b = new StringBuilder();
		for (String string : a) {
			b.append(string + " ");
		}
		System.out.println("after :");
		System.out.println(b);
		
		in.close();
	}

}
