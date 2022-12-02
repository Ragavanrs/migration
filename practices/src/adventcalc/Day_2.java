package adventcalc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file="D:\\java\\practices\\src\\adventcalc\\day_2in.txt";
		try {
			BufferedReader file1= new BufferedReader(new FileReader(file));
			String line;
			int wrapping_paper=0;
			int cube_x=0;
			while ((line=file1.readLine())!=null) {
				String[] a=line.split("x");
				
				
				int[] val=new int[a.length];
				for(int i=0;i<a.length;i++) {
					if(a[i]!="")
					val[i]= Integer.parseInt(a[i]);
					
				}
				Arrays.sort(val);
				int x=2*val[0]*val[1]+2*val[1]*val[2]+2*val[0]*val[2];
				
				int y=val[0]*val[1];
				int i=val[0]*val[1]*val[2];
				int j=val[0]+val[0]+val[1]+val[1];
				wrapping_paper+=x+y;
				cube_x+=i+j;
				
				
				
			}
			
			System.out.println( "wrappers : " + wrapping_paper);
			System.out.println("cube : " + cube_x);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
