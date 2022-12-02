package practices.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class string_int {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a=new ArrayList();
		
		a.add("aabc");
		a.add(2);
		Iterator abc= a.iterator();
		while (abc.hasNext()) {
			Object object = (Object) abc.next();
			System.out.println((object).getClass().getName());
			
		}
	
	List b=new ArrayList<Integer>();
	int x=23;
	b.add(x);
	Iterator bc= a.iterator();
	while (bc.hasNext()) {
		Object object = (Object) bc.next();
		System.out.println((object).getClass().getName());
		
	}
}

	

}
