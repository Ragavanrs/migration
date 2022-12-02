package adventcalc;

import java.io.BufferedReader;
import java.io.FileReader;

public class day_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fl="D:\\java\\practices\\src\\adventcalc\\inp.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fl));
			int floor=0;
			String line;
			while ((line = br.readLine()) != null) {
				char[] a=line.toCharArray();
				for(int i=0;i<a.length;i++) {
					if(a[i]=='(') {
						floor++;
						}
					else if (a[i]==')') {
						floor--;
					}
					if(floor==-1) {
						System.out.println(i+1);
					}
				}
			}
			br.close();
			System.out.println("Floor : "+floor);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
