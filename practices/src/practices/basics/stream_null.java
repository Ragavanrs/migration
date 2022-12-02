package practices.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream_null {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List a=new ArrayList();
		a.add("1q");
		a.add("sav");
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(null);
		a.add("ascv");
		a.add("cac");
		
		System.out.println(a);
		a = (List) a.stream().filter(item-> ((String) item)!=null).collect(Collectors.toList());
		//a.removeIf(null);
		System.out.println(a);
	}

}
