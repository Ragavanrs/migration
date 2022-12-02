package practices.basics;

public class CustomException  {

	public static void main(String[] args)  {
		try {
			int a=4,b=0;
			
			if(a==0||b==0) {
				throw new IndexScreenError("The given value has zero");
			}else {
				System.out.println(a/b);
			}
			
			
		} catch (IndexScreenError e) {
			// TODO: handle exception
			System.out.println(e.word);
		}
		
	}

}
