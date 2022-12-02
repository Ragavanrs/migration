package practices.basics;

public class deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String x="nirmal ragavan";
		final String y="navagar lamrin";
		
		Thread t1=new Thread() {
			public void run() {
				synchronized (x) {
					System.out.println("hello raghav");
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				synchronized (y) {
					System.out.println(" t1 :hello raevon");
				}
			}}
		};
		Thread t2=new Thread() {
			public void run() {
				synchronized (y) {
					System.out.println("t2:hello ritz");
				
				try {
					Thread.sleep(1000);}
				 catch (Exception e) {
					// TODO: handle exception
				}
				synchronized (x) {
					System.out.println(" t2 :hello lamrin");
				}
			}}
		};
	t1.start();
	t2.start();	
	}

}
