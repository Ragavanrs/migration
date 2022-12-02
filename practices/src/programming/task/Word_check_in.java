package programming.task;

public class Word_check_in {

	public static void main(String[] args) {
		
		String a="hacker";
		int b=2,z=1;
		
		String i="",j=""; 
		char[] x=a.toCharArray();
		for (char c : x) {
			
			if(z%b==0)
				i+=c;
			else
				j+=c;
		
			z++;
		}
		System.out.println(j + "    "+ i);
		
	}

}
