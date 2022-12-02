package practices.basics;

public class Stringvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is is immutable
		String s1="Welcome";
		String s2=s1+" to java";
		System.out.println(s2);
		//String buffer is mutable and thread safe
		StringBuffer x=new StringBuffer();
		x.append(s2);
		x.append(" this is an example of String buffer");
		System.out.println(x);
		//StringBuilder is mutable
		StringBuilder y=new StringBuilder();
		y.append(s1);
		//string reverse 
		System.out.println(y.reverse());
		
		
	}

}
