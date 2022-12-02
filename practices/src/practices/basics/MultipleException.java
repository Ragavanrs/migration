package practices.basics;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("try block");
			int a=5;
			int b=0;
			a=a/b;
		}catch (NoSuchFieldError e) {
			// TODO: handle exception
			System.out.println("ArithmeticException : "+ e);
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception : "+ e);
		}
		
	}

}
