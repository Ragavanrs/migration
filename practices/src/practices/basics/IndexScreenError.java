package practices.basics;

@SuppressWarnings("serial")
public class IndexScreenError extends Exception {
	String word;
	IndexScreenError(String a){
		System.out.println("Index issue occured");
		this.word=a;
	}
	
}
