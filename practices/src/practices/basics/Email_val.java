package practices.basics;

public class Email_val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val="nraghav9@ford.com";
		//method 1
		String val1=val.replace("@ford.com","");
		//using split		
		String[] val3=val.split("@");
		System.out.println(val1);
		System.out.println(val3[0]);
	}

}
