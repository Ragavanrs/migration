package practices.basics;

import java.util.Scanner;

public class ascending_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String val=in.next();
		char x[]=val.toCharArray();
		char temp;
		for (int i = 0; i < x.length; i++) {
			for (int j = i; j < x.length; j++) {
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println(String.valueOf(x));
		in.close();
	}

}
