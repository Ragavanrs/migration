package practices.basics;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Binary_search ob=new Binary_search();
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		int x=70;
		int res=ob.Binary_Search(arr,0,arr.length-1,x);
		if(res==-1) {
			System.out.println("element not present");
		}else {
			System.out.println("element present at index of : "+res);
		}
		
		
	}

	int Binary_Search(int[] arr, int l, int r, int x) {
		// TODO Auto-generated method stub
		
		 if (r >= l) {
	            int mid = l + (r - l) / 2;
	 
	            // If the element is present at the
	            // middle itself
	            if (arr[mid] == x)
	                return mid;
	 
	            // If element is smaller than mid, then
	            // it can only be present in left subarray
	            if (arr[mid] > x)
	                return Binary_Search(arr, l, mid - 1, x);
	 
	            // Else the element can only be present
	            // in right subarray
	            return Binary_Search(arr, mid + 1, r, x);
	        }
	 
		
		return -1;
	}

}
