package programming.task;

public class Choco_wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money=50;
		int price=2;
		int times=1;
		int choco=money/price;
		int wrapper=3;
		int total=choco;
		while(times>0) {
			int x=choco/wrapper;
			total+=x;
			choco=x+(choco%x);
			times--;
		}
		System.out.println("number of choclate : " +total + " wrappers left : "+choco);
		
	}

}
