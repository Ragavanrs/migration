package practices.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Write a Java Program to count the number of words in a string using HashMap.
public class count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String word=in.nextLine();
		char ch[]=word.toCharArray();
		Map<Character, Integer> m= new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(m.containsKey(ch[i]))
			{
				m.put(ch[i],m.get(ch[i])+1);
			}
			else
			{
				m.put(ch[i], 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("variable : "+key+" :  count  :  "+val);
		}
		
		in.close();
	}

}
