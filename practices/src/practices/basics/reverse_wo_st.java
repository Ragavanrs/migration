package practices.basics;


import java.util.Scanner;

public class reverse_wo_st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a=new StringBuilder("ragavan");
		System.out.println(a.reverse());
		StringBuffer b=new StringBuffer("nirmal");
		System.out.println(b.reverse());
		Scanner in=new Scanner(System.in);
		String word=in.nextLine();
		char ch[]=word.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		in.close();
	}

}
