package practices.basics;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=Paths.get("C:/Users/ragav/Downloads/sample-text-file.txt");
		try {
			String cont=Files.readString(path);
			System.out.println(cont);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
