package programming.task;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class person_bike {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,4,8,16,20,18,5,3,23};
		int count=0;
		Arrays.sort(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		List l=new ArrayList();
		for(int i=a.length-1;i>=0;i--) {
			int temp=0,val=0;
			for (int j=a.length-2;j>=0;j--) {
			if(l.contains(a[j])) {
				continue;
			}else if(((a[j]+a[i])<24) && ((a[j]+a[i])>temp) ){
				

				temp=a[i]+a[j];
				val=a[j];

			}
			}
			//System.out.println(l);
			//System.out.println(val);
			if(val==0&& !(l.contains(a[i]))) {
				count ++;
				l.add(a[i]);
				System.out.println(a[i] );
				
			}else if((!l.contains(a[i]))&&(!l.contains(val))) {
				count++;
				l.add(a[i]);
				l.add(val);
				System.out.println(a[i] +" "+val);
			}
		}
System.out.println(count);

	}
}