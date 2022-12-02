package programming.task;

import java.util.Arrays;
import java.util.Scanner;

public class First_max_second_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
	System.out.println("enter the number of array element entered");
	int size=input.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<size;i++)
		arr[i]=input.nextInt();
	System.out.println("before modification");
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	rearrange(arr,size);
	System.out.println("After modification");
	System.out.println(Arrays.toString(arr));
	input.close();
}
static void rearrange(int[] arr,int size) {
		int max_ind=size-1,min_ind=0;
		int max_ele=arr[size-1]+1;
		boolean flag=true;
		for(int i=0;i<size;i++) {
			if(flag) {
				arr[i]+=(arr[max_ind]%max_ele)*max_ele;
				max_ind--;
			}
			else {
				arr[i]+=(arr[min_ind]%max_ele)*max_ele;
				min_ind++;
			}flag=!flag;
		}for(int i=0;i<size;i++) {
			arr[i]=arr[i]/max_ele;
		}
}


}
