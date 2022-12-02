package practices.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.*;
@FunctionalInterface
interface lam{
	public int mul(int a,int b);
}

public class stream_lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,2,3,4,5,6);
//		List l=new ArrayList();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(4);
//		l.add(5);
//		l.add(6);
//		
		l.stream().filter(num -> num % 2==0).forEach(System.out::println);

		lam mull=(a,b) -> (a*b);
		
		int a=mull.mul(5, 10);
		System.out.println(a);
	}
}
