package practices.basics;



public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,x,y;
		
				
		for ( x = 0; x <= n-1; x++) {
			for(y=0;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
