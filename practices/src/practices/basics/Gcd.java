package practices.basics;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=120,y=80,gcd=0;

		for(int i=1;i<=x&&i<=y;i++) {
			if(x%i==0&&y%i==0) {
				gcd=i;
			}
		}
		System.out.println("the gcd for x : "+x+" & y : " +y+" & is "+gcd);
	}

}
