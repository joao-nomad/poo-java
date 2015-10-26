package Tarefa9_JAVA;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

	public static boolean eAnagrama(String word1, String word2) 
	{
		word2 = word2.toLowerCase();
		word1 = word1.toLowerCase();
				
		List<Character>arrayOne = new ArrayList<Character>();
		List<Character>arrayTwo = new ArrayList<Character>();
		
		for(char c:word1.replace(" ", "").toCharArray())
		{
			arrayOne.add(c);
		}
		for(char c:word2.replace(" ", "").toCharArray())
		{
			arrayTwo.add(c);
		}
		return arrayOne.containsAll(arrayTwo) && arrayOne.size() == arrayTwo.size();		
	}
}