package programming.task;


import java.util.ArrayList;

import java.util.List;

public class program_add_array {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {6,4,7,2,1,5,3};
		bubbleSort(a);
		int n=10;
		List x= new ArrayList();
		for(int i=0;i<a.length;i++) {
			int count=0,j=i,k=0;
			List y= new ArrayList();
			
			if(i<a.length-1) {
			while(count<n && j<a.length) {
				
				if((j+1)<a.length) {
					if((a[i]+a[j+1])==n) {
					y.clear();
					
					y.add(a[i]);
					count+=a[i];
					y.add(a[j+1]);
					count+=a[j+1];
					x.add(y);

				}
				else {
					
				k++;
				
				y.add(a[j]);
				count+=a[j];

				if(count==n) {
					x.add(y);
				}
				
				}
				}j++;
			
			}
		}
			else {
				while(j>=0) {
					if((j-1)>=0)
					if((a[i]+a[j-1])==n) {
						
						
						y.add(a[i]);
						
						y.add(a[j-1]);
						
						x.add(y);
						
					}
					
					j--;
				}
			}
		}
		
		System.out.println(x);
	}
	public static void bubbleSort(int[] a) {  
        int n = a.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                 //swap elements  
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         }  
                          
                 }  
         }  

}
}