package programming.task;

public class Program_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="PROGRAMER";
		char[] b=a.toCharArray();
		int l=b.length;
		for (int i=0;i<b.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(i==j)
					{System.out.print(b[i]);}
				else if ((i+j)== l -1) {
					System.out.print(b[i]);
				}
				if (j==l-1)
					System.out.println();
				else
					System.out.print(" ");
				}
			}
			
		}
	}

