package Tarefa9_JAVA;

//Importando biblioteca junit para realização dos testes do Anagrama
import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramaTeste {

	@Test
	public void test() 
	{		
		//Testes estabel
		assertTrue(Anagrama.eAnagrama("",""));
		assertTrue(Anagrama.eAnagrama(" ",""));
		assertTrue(Anagrama.eAnagrama("a","a "));
		assertFalse(Anagrama.eAnagrama("a ","b"));
		assertTrue(Anagrama.eAnagrama("ab","ab"));
		assertTrue(Anagrama.eAnagrama("ab","a b"));
		assertTrue(Anagrama.eAnagrama("b a","a b"));
		assertTrue(Anagrama.eAnagrama("ab", "ba"));
		assertFalse(Anagrama.eAnagrama("ba", "a"));
	}

}