package adventcalc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class day_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input_file="D:\\java\\practices\\src\\adventcalc\\day_3in.txt";
		try {
			BufferedReader file=new BufferedReader(new FileReader(input_file));
			
			String line;
			int left_1=0;
			int left_2=0;
			int top_1=0;
			int top_2=0;
			//HashSet list = new HashSet();
			List list=new ArrayList();
			boolean flag=true;
			while ((line=file.readLine())!=null) {
				char[] ch_array=line.toCharArray();
				for (int i = 0; i < ch_array.length; i++) {
					String s="x";
					System.out.println(ch_array[i]);
					if(flag) {
					if(ch_array[i]=='<') {
						left_1--;
					}
					else if(ch_array[i]=='>') {
						left_1++;
					}
					else if(ch_array[i]=='^') {
						top_1++;
					}
					else if(ch_array[i]=='v') {
						top_1--;
					}
					s=left_1+s+top_1;
					}
					else {
						if(ch_array[i]=='<') {
							left_2--;
						}
						else if(ch_array[i]=='>') {
							left_2++;
						}
						else if(ch_array[i]=='^') {
							top_2++;
						}
						else if(ch_array[i]=='v') {
							top_2--;
						}
						s=left_2+s+top_2;
					}
					System.out.println(s);
					if(list.contains(s)) {
						continue;
					}
					else {
						list.add(s);
					}
					flag=!flag;
				}
			}
//			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//				Object object = (Object) iterator.next();
//				System.out.println(object);
//				
//			}
			System.out.println(list.size());
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
